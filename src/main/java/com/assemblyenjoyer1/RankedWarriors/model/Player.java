package com.assemblyenjoyer1.RankedWarriors.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    private UUID uuid;
    private String username;
    @OneToMany
    private List<Account> accounts;
    @ElementCollection
    private List<String> associatedLinks;
    private String country;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany
    private List<Team> teamHistory;
    private boolean isIngame;
    @OneToOne
    private Team currentTeam;
}
