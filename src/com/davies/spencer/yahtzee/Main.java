package com.davies.spencer.yahtzee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int score = 0;
        int categoriesLeft = 15;

        System.out.println("Welcome to Yahtzee!");

        Dice dice = new Dice();

        while (categoriesLeft > 0) {
            dice.rollDice(new int[]{1, 2, 3, 4, 5});
            List<Integer> diceValues = dice.getValues();
            System.out.println("Score: " + score);
            System.out.println("Here is roll #1:");
            dice.printDiceValues();
            List<Integer> holds = new ArrayList<>();
            while (true) {
                System.out.print("Enter the id of a die you want to hold (enter nothing for next roll): ");
                String input = System.console().readLine();
                int numToHold = parseInputToInt(input);
                if (numToHold == -1) {
                    System.out.println("Try again!");
                } else if (numToHold != 0 && holds.indexOf(numToHold) == -1) {
                    holds.add(numToHold);
                } else if (numToHold != 0 && holds.indexOf(numToHold) == -1) {
                    System.out.println("You already picked that die!");
                } else {
                    break;
                }
            }

        }
    }

    private static int parseInputToInt(String input) {
        int response;
        if (input.length() == 0) {
            response = 0;
        } else if (input.length() < 2) {
            try {
                response = (int) input.charAt(0);
            }
            catch (Error e) {
                System.out.print("Not a number! ");
                response = -1;
            }
        } else {
            System.out.print("Too many characters! ");
            response = -1;
        }
        return response;
    }
}
