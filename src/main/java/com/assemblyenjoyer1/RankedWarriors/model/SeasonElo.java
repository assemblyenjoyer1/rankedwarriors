package com.assemblyenjoyer1.RankedWarriors.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SeasonElo{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", insertable = false, updatable = false, nullable = false)
    private UUID uuid;
    private Rank peakRank;
    private int peakLp;
    private Rank rankFinishedOn;
    private int lpFinishedOn;
    private int wins;
    private int losses;
}
