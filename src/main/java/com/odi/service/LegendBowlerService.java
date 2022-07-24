package com.odi.service;

import com.odi.repository.LegendBowlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LegendBowlerService {
    @Autowired
    LegendBowlerRepository legendBowlerRepository;
}
