package com.kovan.rpgbattlesystem.service;

import com.kovan.rpgbattlesystem.model.Character;
import com.kovan.rpgbattlesystem.model.Rogue;
import com.kovan.rpgbattlesystem.model.Warrior;
import org.springframework.stereotype.Service;

@Service
public class BattleService {

    public String startBattle() {

        Character player1 = new Warrior("Arjun");
        Character player2 = new Rogue("Shadow");

        while (player1.isAlive() && player2.isAlive()) {

            player1.attack(player2);
            if (!player2.isAlive()) break;

            player2.attack(player1);
        }

        return player1.isAlive()
                ? player1.getName() + " wins"
                : player2.getName() + " wins";
    }
}
