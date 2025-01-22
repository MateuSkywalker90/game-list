package com.mateus.dslist.repository;

import com.mateus.dslist.entity.Game;
import com.mateus.dslist.projection.GameProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
		SELECT games.id, games.title, games.game_year AS gameYear, games.img_url AS imgUrl,
		games.short_description AS shortDescription, belonging.position
		FROM games
		INNER JOIN belonging ON games.id = belonging.game_id
		WHERE belonging.game_list_id = :listId
		ORDER BY belonging.position
			""")
    List<GameProjection> searchByList(Long listId);
}
