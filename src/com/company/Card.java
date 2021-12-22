package com.company;

public class Card {
    int number;
    //1 = diamonds, 2 = clubs, 3 = hearts, 4 = spades
    int suit;

    public Card(int number, int suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public int getSuit() {
        return suit;
    }
}
