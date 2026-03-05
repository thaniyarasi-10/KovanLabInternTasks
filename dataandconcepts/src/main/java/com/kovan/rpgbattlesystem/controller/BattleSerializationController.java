package com.kovan.rpgbattlesystem.controller;

import com.kovan.rpgbattlesystem.model.Warrior;
import com.kovan.rpgbattlesystem.service.BattleSerializationService;
import com.kovan.rpgbattlesystem.model.Character;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/game")
public class BattleSerializationController {
    private final BattleSerializationService battleSerializationService;

    public BattleSerializationController(BattleSerializationService battleSerializationService) {
        this.battleSerializationService = battleSerializationService;
    }

    // SAVE GAME
    @PostMapping("/save")
    public String saveGame() {

        Character player = new Warrior("Arjun");

        battleSerializationService.saveGame(player);

        return "Game saved successfully";
    }

    // LOAD GAME
    @GetMapping("/load")
    public Character loadGame() {

        return battleSerializationService.loadGame();
    }
}

