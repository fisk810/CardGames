package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    SetController controller = new SetController();
    Hand dealer = new Hand();
    ArrayList<Hand> players = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public BlackJack() {
    }

    //startGame decides how many players there are when the game starts, and then hands all of them and the dealer two cards
    public void startGame(){
        System.out.println("how many players are there?");
        String inPlayerAmount = input.next();
        //if there are no characters except 0 through 9 in the input the if-statement is true
        if (inPlayerAmount.matches("[0-9]+")) {
            int playerAmount = Integer.parseInt(inPlayerAmount);
            if (playerAmount > 0 && playerAmount <= 4) {
                for (int i = 0; i < playerAmount; i++) {
                    players.add(new Hand());
                }
            } else {
                System.out.println("there has to be at least one player and a maximum of 4\n");
                startGame();
            }
        }
        else{
            System.out.println("you have to type a number between 1 and 4\n");
            startGame();
        }
        controller.createBlackJackSet();
        cardHandOut();
    }

    public void gameTurn(){
        System.out.println("Dealers cards\n" + dealer.getCards());
        int pCounter = 1;
        for (int i = 0; i < players.size(); i++) {
            System.out.println("\nPlayer " + pCounter + "'s cards\n" + players.get(i).getCards());
            pCounter++;
        }

    }

    public void addPlayer(){
        players.add(new Hand());
    }

    public void removePlayer(int whichPlayer){
        players.remove(whichPlayer);
    }


    //cardHandOut resembles the start of a new Blackjack turn.
    //the dealer hands himself and each player two cards
    public void cardHandOut(){
        dealer.setCards(controller.generateHand(1));
        for (Hand player : players) {
            player.setCards(controller.generateHand(2));
        }
    }




}
