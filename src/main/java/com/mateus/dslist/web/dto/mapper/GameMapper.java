package com.mateus.dslist.web.dto.mapper;

import com.mateus.dslist.entity.Game;
import com.mateus.dslist.web.dto.GameCreateDto;
import com.mateus.dslist.web.dto.GameResponseDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class GameMapper {

    public static Game gameToDto(GameCreateDto gameCreateDto) {
        return new ModelMapper().map(gameCreateDto, Game.class);
    }

    public static GameResponseDto gameResponseDto(Game game) {
        return new ModelMapper().map(game, GameResponseDto.class);
    }
}
