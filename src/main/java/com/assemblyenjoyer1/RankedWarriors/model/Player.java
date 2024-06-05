package com.assemblyenjoyer1.RankedWarriors.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
public class Player {
    @Id
    private UUID uuid;
    private String username;
    @OneToMany(mappedBy = "uuid")
    private ArrayList<Account> accounts;
    private ArrayList<String> associatedLinks;
    private String country;
    private Role role;
    private ArrayList<Team> teamHistory;

    private boolean isIngame;
    private Team currentTeam;

}
