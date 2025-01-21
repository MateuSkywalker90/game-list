package com.mateus.dslist.web.controller;

import com.mateus.dslist.entity.GameList;
import com.mateus.dslist.service.GameListService;
import com.mateus.dslist.web.dto.GameListResponseDto;
import com.mateus.dslist.web.dto.mapper.GameListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/lists")
public class GameListController {

    private final GameListService gameListService;

    @GetMapping
    public ResponseEntity<List<GameListResponseDto>> getAll() {
        List<GameList> responseGameLists = gameListService.findAll();
        return ResponseEntity.ok().body(GameListMapper.toGameListsDto(responseGameLists));
    }
}
