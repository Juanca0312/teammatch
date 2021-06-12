package com.teammatch.service;

import com.teammatch.model.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface PlayerService {
    Page<Player> getAllPlayers(Pageable pageable);
}
