package com.bridgelabz;

public class SnakeAndLadderGame {
    public static void playerOne(){
        int playerPosition = 0;
        int randomDice = (int) ((Math.random()*10)%6+1);
        System.out.println("Random Roll Dice is "+randomDice);
    }

    public static void main(String[] args) {
        playerOne();
    }
}
