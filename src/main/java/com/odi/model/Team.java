package com.odi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "team", schema = "odi")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "team_name", unique = true)
    private String teamName;

    @Column(name = "position")
    private int position;

    @Column(name = "rating")
    private int rating;

    @Column(name = "points")
    private int points;

    @OneToMany(mappedBy = "team")
    private List<LegendBatter> legendBatterList = new ArrayList<>();

    @OneToMany(mappedBy = "team")
    private List<LegendBowler> legendBowlerList = new ArrayList<>();
}
