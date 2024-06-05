package com.assemblyenjoyer1.RankedWarriors.service;

import com.assemblyenjoyer1.RankedWarriors.model.Player;
import com.assemblyenjoyer1.RankedWarriors.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Player createPlayer(Player player) {
        player.setUuid(UUID.randomUUID());
        System.out.println("current player created: " + player.toString());
        return playerRepository.save(player);
    }
}