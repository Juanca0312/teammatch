package com.teammatch.service;

import com.teammatch.model.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface PlayerService {
    Page<Player> getAllPlayers(Pageable pageable);
    ResponseEntity<?> deletePlayer(Long playerId);
    Player createPlayer(Player player);
    Player getPlayerById(Long playerId);
    Player getPlayerByUsername(String username);
    Player updatePlayer(Long playerId, Player playerRequest);
    Player updateLastConnection(Long playerId);

}
