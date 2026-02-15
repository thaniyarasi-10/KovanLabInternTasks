package com.kovan.rpgbattlesystem.controller;

import com.kovan.rpgbattlesystem.service.BattleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RpgBattleController {

    private final BattleService battleService;

    public RpgBattleController(BattleService battleService) {
        this.battleService = battleService;
    }

    @GetMapping("/battle")
    public String battle() {
        return battleService.startBattle();
    }
}

//http://localhost:8080/battle