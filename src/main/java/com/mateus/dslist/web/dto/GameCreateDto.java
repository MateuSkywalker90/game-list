package com.mateus.dslist.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GameCreateDto {

    @NotBlank
    private String title;
    @NotBlank
    @Size(min = 4, max = 4)
    private Integer year;
    private String imgUrl;
    @NotBlank
    private String shortDescription;

}
