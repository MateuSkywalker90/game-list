package com.mateus.dslist.web.controller;

import com.mateus.dslist.service.GameListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/lists")
public class GameListController {

    private final GameListService gameListService;
}
