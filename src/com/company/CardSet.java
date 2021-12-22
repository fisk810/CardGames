package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CardSet {
    ArrayList<Card> set = new ArrayList<>();

    public CardSet() {
    }

    public ArrayList<Card> getSet() {
        return set;
    }

    public void setSet(ArrayList<Card> set) {
        this.set = set;
    }

    public void createSet(){

        for (int i = 1; i < 5; i++) {
            for (int e = 1; e <= 13; e++) {
                set.add(new Card(e, i));
            }

        }
        System.out.println(set);
    }

}
