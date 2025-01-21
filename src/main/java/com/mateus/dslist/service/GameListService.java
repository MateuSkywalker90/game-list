package com.mateus.dslist.service;

import com.mateus.dslist.entity.GameList;
import com.mateus.dslist.repository.GameListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameList> findAll() {
        return gameListRepository.findAll();
    }

}
