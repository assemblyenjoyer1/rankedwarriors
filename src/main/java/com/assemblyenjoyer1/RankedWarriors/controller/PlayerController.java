package com.assemblyenjoyer1.RankedWarriors.controller;

import com.assemblyenjoyer1.RankedWarriors.model.Account;
import com.assemblyenjoyer1.RankedWarriors.model.Player;
import com.assemblyenjoyer1.RankedWarriors.service.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PlayerController {

    private final PlayerServiceImpl playerServiceImpl;

    @Autowired
    public PlayerController(PlayerServiceImpl playerServiceImpl) {
        this.playerServiceImpl = playerServiceImpl;
    }

    @PostMapping("/create")
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
        Player createdPlayer = playerServiceImpl.createPlayer(player);
        System.out.println("Created Player: " + createdPlayer.toString());
        return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
    }

}
