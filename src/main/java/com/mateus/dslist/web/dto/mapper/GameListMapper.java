package com.mateus.dslist.web.dto.mapper;

import com.mateus.dslist.entity.GameList;
import com.mateus.dslist.web.dto.GameListCreateDto;
import com.mateus.dslist.web.dto.GameListResponseDto;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class GameListMapper {

    public static GameList gameListToDto(GameListCreateDto gameListCreateDto) {
        return new ModelMapper().map(gameListCreateDto, GameList.class);
    }

    public static GameListResponseDto gameListResponseDto(GameList gameList) {
        return new ModelMapper().map(gameList, GameListResponseDto.class);
    }

    public static List<GameListResponseDto> toGameListsDto(List<GameList> lists) {
        return lists.stream().map(gameList -> gameListResponseDto(gameList)).collect(Collectors.toList());
    }
}
