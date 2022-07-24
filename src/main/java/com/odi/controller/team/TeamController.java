package com.odi.controller.team;

import com.odi.dto.teamResponseDTO.TeamResponseDTO;
import com.odi.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamService teamService;

    @RequestMapping(method = RequestMethod.GET, value = "/get-all-v1")
    public List<TeamResponseDTO> getAllTeamsV1() {
        return teamService.getAllTeamsV1();
    }
}
