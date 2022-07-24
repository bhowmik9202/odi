package com.odi.service;

import com.odi.dto.legendBatterResponseDTO.LegendBatterResponseDTO;
import com.odi.dto.teamResponseDTO.TeamResponseDTO;
import com.odi.model.LegendBatter;
import com.odi.model.Team;
import com.odi.repository.LegendBatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LegendBatterService {
    @Autowired
    LegendBatterRepository legendBatterRepository;
    @Autowired
    TeamService teamService;

    public List<LegendBatter> getAllV1() {
        return legendBatterRepository.findAll();
    }

    public List<LegendBatterResponseDTO> getAllV2() {
        List<LegendBatter> legendBatterList = new ArrayList<>();
        legendBatterList = legendBatterRepository.findAll();
        List<LegendBatterResponseDTO> legendBatterResponse = new ArrayList<>();
        for (LegendBatter legendBatter : legendBatterList) {
            LegendBatterResponseDTO dto = new LegendBatterResponseDTO();
            dto.setId(legendBatter.getId());
            dto.setBatterName(legendBatter.getBatterName());
            dto.setMatches(legendBatter.getMatches());
            dto.setAvg(legendBatter.getAvg());
            dto.setFifties(legendBatter.getFifties());
            dto.setHundreds(legendBatter.getHundreds());

            Team team = new Team();
            Optional<Team> teamOptional = teamService.findById(legendBatter.getTeam().getId());
            if (teamOptional.isPresent()) {
                team = teamOptional.get();
            } else {
                throw new RuntimeException("No team found with id --> " + legendBatter.getTeam().getId());
            }
            TeamResponseDTO teamResponseDTO = new TeamResponseDTO();
            teamResponseDTO.setTeamId(team.getId());
            teamResponseDTO.setTeamName(team.getTeamName());
            teamResponseDTO.setTeamPosition(team.getPosition());
            teamResponseDTO.setTeamPoints(team.getPoints());
            teamResponseDTO.setTeamRating(team.getRating());

            dto.setTeamResponseDTO(teamResponseDTO);

            legendBatterResponse.add(dto);
        }
        return legendBatterResponse;
    }
}
