package classwork.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {
    private static final SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int continueGame;
        do {
            int magicNumber = secureRandom.nextInt(1000) + 1;
            int guessedNumber;
            int count = 0;
            do {
                count++;
                System.out.print("Guess a number between 1 - 1000: ");
                guessedNumber = input.nextInt();

                if (guessedNumber > magicNumber){
                    System.out.println("Too high, try again!");
                }
                else if (guessedNumber < magicNumber){
                    System.out.println("Too low, try again!");
                } else {
                    System.out.println("Congratulations!");
                    if(count < 10){
                        System.out.println("Either you know the secret or you got lucky!");
                    } else if (count > 10){
                        System.out.println("You should be able to do better!");
                    } else {
                        System.out.println("Aha! You know the secret!");
                    }
                }
            } while(guessedNumber != magicNumber);

            System.out.print("Press 1 to start game again, 0 to quit: ");
            continueGame = input.nextInt();
        } while(continueGame == 1);
    }
}
