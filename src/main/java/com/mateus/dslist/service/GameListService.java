package com.mateus.dslist.service;

import com.mateus.dslist.entity.GameList;
import com.mateus.dslist.projection.GameProjection;
import com.mateus.dslist.repository.GameListRepository;
import com.mateus.dslist.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    private final GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameList> findAll() {
        return gameListRepository.findAll();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameProjection> list = gameRepository.searchByList(listId);

        GameProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }

    }
}
