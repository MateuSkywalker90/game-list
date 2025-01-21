package com.mateus.dslist.service;

import com.mateus.dslist.repository.GameListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GameListService {

    private final GameListRepository gameListRepository;
}
