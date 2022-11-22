package com.bridgelabz;

public class SnakeAndLadderGame {
    public static int playerOne(){
        int playerPosition = 1;
        int sumOfRollDie=0;



        while (playerPosition <=100) {

            int randomDice = (int) ((Math.random() * 10) % 6 + 1);

                //snake
            if (sumOfRollDie==20 || sumOfRollDie==35 || sumOfRollDie==50 || sumOfRollDie==65 || sumOfRollDie==80 ){
                sumOfRollDie-=15;
            }
            //ladder
            if (sumOfRollDie==15 || sumOfRollDie==30 || sumOfRollDie==45 || sumOfRollDie==60 || sumOfRollDie==75 ){
                sumOfRollDie+=15;
            }

            if (sumOfRollDie >=94){
                break;
            }
            playerPosition++;


            sumOfRollDie += randomDice;
            System.out.println("Player number of roll die - "+playerPosition+" and position - "+sumOfRollDie);

        }
        int cont =0;
        int dif = 100-sumOfRollDie;
        while (playerPosition <=100){
            int randomDice = (int) ((Math.random() * 10) % 6 + 1);
            if (cont == dif){
                break;
            }
            cont++;
            playerPosition++;
        }
        int totalSumOfRollDies = cont+sumOfRollDie;
        System.out.println("Player number of roll die - "+playerPosition+" and position - "+totalSumOfRollDies);


        return playerPosition;

    }

    public static void main(String[] args) {
        int playerOne = playerOne();
        System.out.println("Player won at the number of roll dies : "+playerOne);
    }
}
