package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CardSet {
    ArrayList<Card> set = new ArrayList<>();

    public CardSet() {
    }


    public void createSet(){
        String[] suits = {"diamonds", "hearts", "clubs", "spades"};

        for (int i = 0; i < 4; i++) {
            for (int e = 1; e <= 13; e++) {
                set.add(new Card(e, suits[i]));
            }

        }
    }


    public ArrayList<Card> getSet() {
        return set;
    }

    public void setSet(ArrayList<Card> set) {
        this.set = set;
    }



}
