package com.company;

public class Card {
    int number;
    //1 = diamonds, 2 = clubs, 3 = hearts, 4 = spades
    String suit;

    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "-----------------------------\nCard: number: " + number + ", suit: " + suit + "\n-----------------------------";
    }

    public int getNumber() {
        return number;
    }

    public String getSuit() {
        return suit;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
