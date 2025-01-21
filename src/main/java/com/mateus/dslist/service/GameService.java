package com.mateus.dslist.service;

import com.mateus.dslist.entity.Game;
import com.mateus.dslist.projection.GameProjection;
import com.mateus.dslist.repository.GameRepository;
import jakarta.persistence.EntityNotFoundException;
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

    @Transactional(readOnly = true)
    public Game findById(Long id) {
        return gameRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(String.format("Game id=%s not found.", id))
        );
    }

    @Transactional(readOnly = true)
    public List<GameProjection> findByList(Long listId) {
        return gameRepository.searchByList(listId);
    }
}
