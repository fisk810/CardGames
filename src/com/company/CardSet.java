package com.company;

import java.util.Arrays;
import java.util.Random;

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

    public void shuffle(){
        Random random = new Random();
        //random.nextInt(max - min + 1) + min
        Card tempholder;
        for (int i = 0; i < 10000; i++) {
            int randomFirstCard = random.nextInt(51 + 1);
            int randomSecondCard = random.nextInt(51 + 1);
            tempholder = set[randomFirstCard];
            set[randomFirstCard] = set[randomSecondCard];
            set[randomSecondCard] = tempholder;

        }
    }

    public void setSet(Card[] set) {
        this.set = set;
    }

    public Card[] getSet() {
        return set;
    }
}
