package snacks;

import java.util.Scanner;

public class GuessApp {
    public static void main(String[] args) {
        final int magicNumber = 34;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Guess the magic number: ");
            int num = input.nextInt();

            if(num > magicNumber){
                System.out.println("Too high, try again!");
            } else if (num < magicNumber) {
                System.out.println("Too low, try again!");
            } else {
                System.out.println("Perfect!");
                break;
            }
        }
    }
}
