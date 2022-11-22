package com.bridgelabz;

public class SnakeAndLadderGame {
    public static void playerOne(){
        int playerPosition = 1;
        int sumOfRollDie=0;



        while (playerPosition <=100) {
            int randomDice = (int) ((Math.random() * 10) % 6 + 1);
            sumOfRollDie += playerPosition;

            if (sumOfRollDie==20 || sumOfRollDie==35 || sumOfRollDie==50 || sumOfRollDie==65 || sumOfRollDie==80 ){
                sumOfRollDie-=15;
            }
            if (sumOfRollDie==15 || sumOfRollDie==30 || sumOfRollDie==45 || sumOfRollDie==60 || sumOfRollDie==75 ){
                sumOfRollDie+=15;
            }

            if (sumOfRollDie >=100){
                break;
            }
            System.out.println("Player number of roll die - "+playerPosition+" and position - "+sumOfRollDie);
            playerPosition++;
        }

    }

    public static void main(String[] args) {
        playerOne();
    }
}
