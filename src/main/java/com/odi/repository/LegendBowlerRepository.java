package com.odi.repository;

import com.odi.model.LegendBatter;
import com.odi.model.LegendBowler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LegendBowlerRepository extends JpaRepository<LegendBowler, Long> {
    
}
