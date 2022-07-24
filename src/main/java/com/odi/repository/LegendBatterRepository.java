package com.odi.repository;

import com.odi.model.LegendBatter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegendBatterRepository extends JpaRepository<LegendBatter, Long> {
}
