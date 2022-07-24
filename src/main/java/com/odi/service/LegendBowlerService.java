package com.odi.service;

import com.odi.dto.legendBatterResponseDTO.LegendBatterResponseDTO;
import com.odi.dto.legendBowlerResponseDTO.LegendBowlerResponseDTO;
import com.odi.dto.teamResponseDTO.TeamResponseDTO;
import com.odi.model.LegendBatter;
import com.odi.model.LegendBowler;
import com.odi.model.Team;
import com.odi.repository.LegendBowlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LegendBowlerService {
    @Autowired
    LegendBowlerRepository legendBowlerRepository;
    @Autowired
    TeamService teamService;

    public List<LegendBowler> getAllV1() {
        return legendBowlerRepository.findAll();
    }

    public List<LegendBowlerResponseDTO> getAllVV2() {
        List<LegendBowler> legendBowlerList = new ArrayList<>();
        legendBowlerList = legendBowlerRepository.findAll();
        List<LegendBowlerResponseDTO> legendBowlerResponse = new ArrayList<>();
        for (LegendBowler legendBowler : legendBowlerList) {
            LegendBowlerResponseDTO dto = new LegendBowlerResponseDTO();
            dto.setId(legendBowler.getId());
            dto.setBowlerName(legendBowler.getBowlerName());
            dto.setMatches(legendBowler.getMatches());
            dto.setAvg(legendBowler.getAvg());
            dto.setEcon(legendBowler.getEcon());
            dto.setWickets(legendBowler.getWickets());

            Team team = new Team();
            Optional<Team> teamOptional = teamService.findById(legendBowler.getTeam().getId());
            if (teamOptional.isPresent()) {
                team = teamOptional.get();
            } else {
                throw new RuntimeException("No team found with id --> " + legendBowler.getTeam().getId());
            }
            TeamResponseDTO teamResponseDTO = new TeamResponseDTO();
            teamResponseDTO.setTeamId(team.getId());
            teamResponseDTO.setTeamName(team.getTeamName());
            teamResponseDTO.setTeamPosition(team.getPosition());
            teamResponseDTO.setTeamPoints(team.getPoints());
            teamResponseDTO.setTeamRating(team.getRating());

            dto.setTeamResponseDTO(teamResponseDTO);

            legendBowlerResponse.add(dto);
        }
        return legendBowlerResponse;
    }
}
