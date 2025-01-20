package com.mateus.dslist.service;

import com.mateus.dslist.entity.Game;
import com.mateus.dslist.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GameService {

    private final GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<Game> findAll() {
        return gameRepository.findAll();
    }
}
