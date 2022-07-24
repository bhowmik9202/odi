package com.odi.dto.legendBowlerResponseDTO;

import com.odi.dto.teamResponseDTO.TeamResponseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LegendBowlerResponseDTO {
    private Long id;
    private String bowlerName;
    private int matches;
    private int wickets;
    private BigDecimal avg;
    private BigDecimal econ;
    private TeamResponseDTO teamResponseDTO;
}
