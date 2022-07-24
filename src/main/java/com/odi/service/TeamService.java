package com.odi.service;

import com.odi.model.Team;
import com.odi.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;

    public List<Team> getAllV1() {
        return teamRepository.findAll();
    }
}
