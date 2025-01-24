package com.mateus.dslist.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReplacementCreateDto {

    private Integer sourceIndex;
    private Integer destinationIndex;
}
