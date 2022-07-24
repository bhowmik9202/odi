package com.odi.dto.teamResponseDTO;

import lombok.Data;

@Data
public class TeamResponseDTO {
    private Long teamId;
    private String teamName;
    private int teamPosition;
    private int teamRating;
    private int teamPoints;
}
