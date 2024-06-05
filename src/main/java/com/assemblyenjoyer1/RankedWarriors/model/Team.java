package com.assemblyenjoyer1.RankedWarriors.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Setter
@Component
public class Team implements Serializable {
    private String iconUrl;
    private String teamName;
    private ArrayList<Player> currentPlayers;
    private ArrayList<Player> playerHistory;
}
