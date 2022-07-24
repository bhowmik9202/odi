package com.odi.service;

import com.odi.model.LegendBatter;
import com.odi.model.LegendBowler;
import com.odi.repository.LegendBowlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegendBowlerService {
    @Autowired
    LegendBowlerRepository legendBowlerRepository;

    public List<LegendBowler> getAllV1() {
        return legendBowlerRepository.findAll();
    }

    public List<LegendBowler> getAllVV2() {
        return null;
    }
}
