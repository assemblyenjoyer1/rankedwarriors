package com.assemblyenjoyer1.RankedWarriors.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {
    @Id
    private UUID uuid;
    private int currentRank;
    private int peakRank;
    private Username currentName;
    private ArrayList<String> nameHistory;
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Season.class)
    private Map<Season, SeasonElo> pastRanks;
}
