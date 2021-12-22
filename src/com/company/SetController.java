package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SetController {
    CardSet set = new CardSet();
    public SetController() {
    }

    public void createShuffledSet(){
        Random random = new Random();
        set.createSet();
        //random.nextInt(max - min + 1) + min
        Card tempholder;
        for (int i = 0; i < 10000; i++) {
            int randomFirstCard = random.nextInt(51 + 1);
            int randomSecondCard = random.nextInt(51 + 1);
            tempholder = set.getSet().get(randomFirstCard);
            set.getSet().set(randomFirstCard, set.getSet().get(randomSecondCard));
            set.getSet().set(randomSecondCard, tempholder);
        }
    }

    public void createUnShuffledSet(){
        set.createSet();
    }

    public void createBlackJackSet(){
        createShuffledSet();
        for (int i = 0; i < set.getSet().size(); i++) {
            if(set.getSet().get(i).getNumber() == 11 || set.getSet().get(i).getNumber() == 12 || set.getSet().get(i).getNumber() == 13){
                set.getSet().get(i).setNumber(10);
            }
            if(set.getSet().get(i).getNumber() == 1){
                set.getSet().get(i).setNumber(11);
            }
        }
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
