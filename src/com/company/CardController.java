package com.company;

import java.util.Arrays;
import java.util.Random;

public class CardController {
    CardSet cardSet = new CardSet();
    Card[] set = cardSet.getSet();


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

}
