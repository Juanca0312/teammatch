package com.teammatch.controller;

import com.teammatch.model.Player;
import com.teammatch.resource.PlayerResource;
import com.teammatch.resource.SavePlayerResource;
import com.teammatch.service.PlayerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PlayerController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public Page<PlayerResource> getAllPlayers( Pageable pageable) {
        Page<Player> playersPage = playerService.getAllPlayers(pageable);
        List<PlayerResource> resources = playersPage.getContent().stream().map(this::convertToResource).collect(Collectors.toList());

        return new PageImpl<>(resources, pageable, resources.size());
    }


    private Player convertToEntity(SavePlayerResource resource) {
        return mapper.map(resource, Player.class);
    }

    private PlayerResource convertToResource(Player entity) {
        return mapper.map(entity, PlayerResource.class);
    }


}
