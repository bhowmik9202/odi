package com.odi.controller.legendBatter;

import com.odi.model.LegendBatter;
import com.odi.service.LegendBatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/legend-batter")
public class LegendBatterController {
    @Autowired
    LegendBatterService legendBatterService;

    @RequestMapping(method = RequestMethod.GET, value = "/get-all-v1")
    public List<LegendBatter> getAllV1() {
        return legendBatterService.getAllV1();
    }
}
