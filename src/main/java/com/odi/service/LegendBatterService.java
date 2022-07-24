package com.odi.service;

import com.odi.model.LegendBatter;
import com.odi.repository.LegendBatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegendBatterService {
    @Autowired
    LegendBatterRepository legendBatterRepository;

    public List<LegendBatter> getAllV1() {
        return legendBatterRepository.findAll();
    }
}
