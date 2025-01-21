package com.mateus.dslist.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GameListCreateDto {

    @NotBlank
    private String name;

}
