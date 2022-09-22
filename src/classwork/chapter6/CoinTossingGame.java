package classwork.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossingGame {
    private enum Coin { HEAD, TAIL }

    private static int numOfHeads;
    private static int numOfTails;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("""
                    Welcome to the coin game

                    Press 1 -> Toss Coin
                    Press 2 -> end game""");
            option = input.nextInt();

            if(option == 1){
                switch(toss()){
                    case HEAD -> numOfHeads++;
                    case TAIL -> numOfTails++;
                }
            }
        } while (option == 1);

        System.out.println("Number of HEAD: "+ numOfHeads);
        System.out.println("Number of TAIL: "+ numOfTails);
    }

    private static Coin toss(){
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(2) == 0 ? Coin.HEAD : Coin.TAIL;
    }
}
