package fr.fixgia.dicegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceGame {

    List<Dice> DropFiveDice() {
        int min = 1; // Minimum value of range
        int max = 6;
        List diceList = new ArrayList();
        for (int i=0; i<5; ++i){
            int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
            Dice dice = new Dice();
            dice.setDice(i);
            dice.setFace(random_int);
            diceList.add(dice);
            System.out.println("dice: "+ i + " is a " + random_int);
        }
        return diceList;
    }

}
