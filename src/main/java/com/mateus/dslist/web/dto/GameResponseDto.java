package com.mateus.dslist.web.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GameResponseDto {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
}
