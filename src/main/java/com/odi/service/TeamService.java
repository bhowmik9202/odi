package com.odi.service;

import com.odi.dto.teamResponseDTO.TeamResponseDTO;
import com.odi.model.Team;
import com.odi.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;

    public List<Team> getAllV1() {
        return teamRepository.findAll();
    }

    public List<TeamResponseDTO> getAllTeamsV1() {
        List<Team> teamList = teamRepository.findAll();
        List<TeamResponseDTO> teamResponse = new ArrayList<>();
        for (Team team : teamList) {
            TeamResponseDTO dto = new TeamResponseDTO();
            dto.setTeamId(team.getId());
            dto.setTeamName(team.getTeamName());
            dto.setTeamPoints(team.getPoints());
            dto.setTeamRating(team.getRating());
            dto.setTeamPosition(team.getPosition());
            teamResponse.add(dto);
        }
        return teamResponse;
    }
}
