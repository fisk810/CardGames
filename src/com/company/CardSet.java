package com.company;

import java.util.Arrays;

public class CardSet {
    Card[] set = new Card[52];

    public CardSet() {
        int counter = 0;
        for (int i = 1; i < 5; i++) {
            for (int e = 1; e <= 13; e++) {
                set[counter] = new Card(e, i);
                counter++;

            }

        }
    }
}
