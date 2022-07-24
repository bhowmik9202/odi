package com.odi.controller.legendBowler;

import com.odi.dto.legendBowlerResponseDTO.LegendBowlerResponseDTO;
import com.odi.model.LegendBowler;
import com.odi.service.LegendBowlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/legend-bowler")
public class LegendBowlerController {
    @Autowired
    LegendBowlerService legendBowlerService;

    @RequestMapping(method = RequestMethod.GET, value = "/get-all-v1")
    public List<LegendBowler> getAllV1() {
        return legendBowlerService.getAllV1();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get-all-v2")
    public List<LegendBowlerResponseDTO> getAllVV2() {
        return legendBowlerService.getAllVV2();
    }
}
