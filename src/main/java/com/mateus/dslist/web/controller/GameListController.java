package com.mateus.dslist.web.controller;

import com.mateus.dslist.entity.GameList;
import com.mateus.dslist.projection.GameProjection;
import com.mateus.dslist.service.GameListService;
import com.mateus.dslist.service.GameService;
import com.mateus.dslist.web.dto.GameListResponseDto;
import com.mateus.dslist.web.dto.ReplacementCreateDto;
import com.mateus.dslist.web.dto.mapper.GameListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/lists")
public class GameListController {

    private final GameListService gameListService;

    private final GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListResponseDto>> getAll() {
        List<GameList> responseGameLists = gameListService.findAll();
        return ResponseEntity.ok().body(GameListMapper.toGameListsDto(responseGameLists));
    }

    @GetMapping("/{listId}/games")
    public ResponseEntity<List<GameProjection>> getAllByList(@PathVariable Long listId) {
        List<GameProjection> responseGameList = gameService.findByList(listId);
        return ResponseEntity.ok().body(responseGameList);
    }

    @PostMapping("/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementCreateDto replacementCreateDto) {
        gameListService.move(listId, replacementCreateDto.getSourceIndex(), replacementCreateDto.getDestinationIndex());
    }
}
