package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CardController {
    CardSet set = new CardSet();
    public CardController() {
    }

    public void shuffle(){
        Random random = new Random();
        //random.nextInt(max - min + 1) + min
        Card tempholder;
        for (int i = 0; i < 10000; i++) {
            int randomFirstCard = random.nextInt(51 + 1);
            int randomSecondCard = random.nextInt(51 + 1);
            tempholder = set.getSet().get(randomFirstCard);
            set.getSet().set(randomFirstCard, set.getSet().get(randomSecondCard));
            set.getSet().set(randomSecondCard, tempholder);

        }
        System.out.println(set.getSet());
    }

    //Creates card array to give to a hand
    public ArrayList<Card> generateHand(int cardAmount){
        ArrayList<Card> handSet = new ArrayList<>();
        for (int i = 0; i < cardAmount; i++) {
            handSet.add(set.getSet().get(0));
            set.getSet().remove(0);
        }
        return handSet;
    }
}
