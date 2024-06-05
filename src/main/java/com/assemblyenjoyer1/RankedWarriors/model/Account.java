package com.assemblyenjoyer1.RankedWarriors.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", insertable = false, updatable = false, nullable = false)
    private UUID uuid;
    private int currentRank;
    private int peakRank;
    private String currentName;
    @ElementCollection
    @CollectionTable(name = "account_past_ranks", joinColumns = @JoinColumn(name = "account_uuid"))
    @MapKeyColumn(name = "season", length = 50)
    private Map<Season, SeasonElo> pastRanks;
    @ElementCollection
    @CollectionTable(name = "account_name_history", joinColumns = @JoinColumn(name = "account_uuid"))
    private List<String> nameHistory;
}