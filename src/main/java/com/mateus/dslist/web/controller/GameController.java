package com.mateus.dslist.web.controller;

import com.mateus.dslist.entity.Game;
import com.mateus.dslist.service.GameService;
import com.mateus.dslist.web.dto.GameResponseDto;
import com.mateus.dslist.web.dto.mapper.GameMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/games")
public class GameController {

    private final GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameResponseDto>> getAll() {
        List<Game> responseGameList = gameService.findAll();
        return ResponseEntity.ok(GameMapper.toGameListDto(responseGameList));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameResponseDto> getGameById(@PathVariable Long id) {
        Game responseGameId = gameService.findById(id);
        return ResponseEntity.ok(GameMapper.gameResponseDto(responseGameId));
    }
}
