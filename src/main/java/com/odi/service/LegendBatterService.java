package com.odi.service;

import com.odi.repository.LegendBatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LegendBatterService {
    @Autowired
    LegendBatterRepository legendBatterRepository;
}
