package com.odi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "legend_bowler", schema = "odi")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LegendBowler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bowler_name", unique = true)
    private String bowlerName;

    @Column(name = "matches")
    private int matches;

    @Column(name = "wickets")
    private int wickets;

    @Column(name = "avg")
    private BigDecimal avg;

    @Column(name = "econ")
    private BigDecimal econ;

    @ManyToOne
    @JoinColumn(name = "team_id")
    @JsonIgnore
    private Team team;
}
