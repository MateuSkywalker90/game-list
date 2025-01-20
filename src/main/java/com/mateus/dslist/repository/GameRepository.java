package com.mateus.dslist.repository;

import com.mateus.dslist.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
