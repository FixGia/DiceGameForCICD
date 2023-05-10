package fr.fixgia.dicegame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DiceGameTest {

    DiceGame diceGame = new DiceGame();
    Dice dice = new Dice();
    @Test
    @DisplayName("Il y a 5 dés")
    void test5Dices(){
        diceGame.DropFiveDice();
        assertEquals(5, diceGame.DropFiveDice().size());
    }

    @Test
    @DisplayName("Il y a 7 dés")
    void test7Dices(){
        diceGame.DropFiveDice();
        assertEquals(7, diceGame.DropFiveDice().size());
    }

}
