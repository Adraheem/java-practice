package tdd;

import java.util.Scanner;

public class GuessNumber {
//    public static void main(String[] args) {
//        final int actualNumber = 41;
//        Scanner input = new Scanner(System.in);
//
////        int count = 0;
//        for (int count = 0; count < 3; count++) {
//            System.out.print("Guess a number: ");
//            int number = input.nextInt();
//
//            if (number == actualNumber) {
//                System.out.println("Perfect!");
//                break;
//            } else if (number < actualNumber) {
//                System.out.println("Too low!");
//            } else {
//                System.out.println("Too high!");
//            }
////            count++;
//        }
//    }

    public static void main(String[] args) {
        int count = 2;
        while(count <= 10){
            System.out.print(count + " ");
            count+=2;
        }
    }
}
