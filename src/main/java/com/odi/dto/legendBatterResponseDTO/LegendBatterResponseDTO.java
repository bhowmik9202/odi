package com.odi.dto.legendBatterResponseDTO;

import com.odi.dto.teamResponseDTO.TeamResponseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LegendBatterResponseDTO {
    private Long id;
    private String batterName;
    private int matches;
    private int fifties;
    private int hundreds;
    private BigDecimal avg;
    private TeamResponseDTO teamResponseDTO;
}
