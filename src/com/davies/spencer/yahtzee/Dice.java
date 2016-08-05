package com.davies.spencer.yahtzee;


import java.util.ArrayList;
import java.util.List;

class Dice {
    private List<Die> allDice = new ArrayList<Die>();

    Dice() {
        for (int i = 1; i < 6; i++) {
            Die die = new Die(i);
            allDice.add(die);
        }
    }

    List<Integer> getValues() {
        List<Integer> values = new ArrayList<Integer>();
        for (Die die : allDice) {
            values.add(die.getValue());
        }
        return values;
    }

    void printDiceValues() {
        for(Die die : allDice) {
            System.out.println("Die " + die.getId() + ": " + die.getValue());
        }
    }

    void rollDice(int[] dice) {
        for (Integer dieId : dice) {
            List<Integer> allIds = new ArrayList<>();
            for(Die die : allDice) {
                allIds.add(die.getId());
            }
            int dieIndex = allIds.indexOf(dieId);
            allDice.get(dieIndex).roll();
        }
    }
}
