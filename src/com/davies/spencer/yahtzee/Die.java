package com.davies.spencer.yahtzee;


class Die {
    private int value;
    private int id;

    int getValue() {
        return value;
    }

    int getId() {
        return id;
    }

    Die(int id) {
        this.id = id;
    }

    int roll() {
        value = (int) Math.floor((Math.random() * 6) + 1);
        return value;
    }
}
