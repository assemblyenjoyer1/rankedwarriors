package com.assemblyenjoyer1.RankedWarriors.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Getter
@Setter
@Component
public class SeasonElo implements Serializable {
    private Rank peakRank;
    private int peakLp;
    private Rank rankFinishedOn;
    private int lpFinishedOn;
    private int wins;
    private int losses;
}
