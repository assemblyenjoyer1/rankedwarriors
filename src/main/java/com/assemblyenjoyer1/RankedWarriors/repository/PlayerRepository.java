package com.assemblyenjoyer1.RankedWarriors.repository;

import com.assemblyenjoyer1.RankedWarriors.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PlayerRepository extends JpaRepository<Player, UUID> {
    Optional<Player> findByUsername(String username);
}
