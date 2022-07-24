package com.odi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "legend_batter", schema = "odi")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LegendBatter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "batter_name", unique = true)
    private String batterName;

    @Column(name = "matches")
    private int matches;

    @Column(name = "fifties")
    private int fifties;

    @Column(name = "hundreds")
    private int hundreds;

    @Column(name = "avg")
    private BigDecimal avg;

    @ManyToOne
    @JoinColumn(name = "team_id")
    @JsonIgnore
    private Team team;
}
