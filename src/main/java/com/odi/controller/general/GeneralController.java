package com.odi.controller.general;

import com.odi.model.Team;
import com.odi.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/general")
public class GeneralController {
    @Autowired
    TeamService teamService;

    @RequestMapping(method = RequestMethod.GET, value = "/get-all-v1")
    public List<Team> getAllV1() {
        return teamService.getAllV1();
    }
}
