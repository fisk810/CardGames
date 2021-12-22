package com.company;

import java.util.ArrayList;

public class BlackJack {
    CardController controller = new CardController();
    Hand dealer = new Hand();
    ArrayList<Hand> players = new ArrayList<>();

    public BlackJack() {
    }

    public void startGame(int playerAmount){
        if(playerAmount > 0 || playerAmount <= 4){
            if(playerAmount == 1){
                players.add(new Hand());
            }
            else if(playerAmount == 2){
                players.add(new Hand());
                players.add(new Hand());
            }
            else if(playerAmount == 3){
                players.add(new Hand());
                players.add(new Hand());
                players.add(new Hand());
            }
            else if(playerAmount == 4){
                players.add(new Hand());
                players.add(new Hand());
                players.add(new Hand());
                players.add(new Hand());
            }
        }
        else{
            System.out.println("there has to be at least one player and a maximum of 4");
        }
    }

    public void addPlayer(){
        players.add(new Hand());
    }

    public void removePlayer(int whichPlayer){
        players.remove(whichPlayer);
    }

    public void cardHandOut(){
        for (Hand player : players) {
            player.setCards(controller.generateHand(2));

        }
        System.out.println();
    }




}
