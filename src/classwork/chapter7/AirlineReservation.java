package classwork.chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservation {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean[] seatReservation = new boolean[10];

        do {
            System.out.println("""
                    Type 1 for First class
                    Type 2 for Economy""");
            int choice = input.nextInt();
            if (choice == 1) {
                int assigned = -1;
                for (int i = 0; i < 5; i++) {
                    if (!seatReservation[i]) {
                        seatReservation[i] = true;
                        assigned = i + 1;
                        break;
                    }
                }

                if (assigned == -1) {
                    System.out.println("Sorry, no more space in the First class\nPress 1 to try again and choose Economy!");
                } else {
                    System.out.printf("We just reserved a seat for you in First class, seat no. %d%n", assigned);
                }
            } else if (choice == 2) {
                int assigned = -1;
                for (int i = 5; i < 10; i++) {
                    if (!seatReservation[i]) {
                        seatReservation[i] = true;
                        assigned = i + 1;
                        break;
                    }
                }

                if (assigned == -1) {
                    System.out.println("Sorry, no more space in the First class\nPress 1 to try again and choose Economy!");
                } else {
                    System.out.printf("We just reserved a seat for you in Economy, seat no. %d%n", assigned);
                }
            } else {
                System.out.println("Invalid input, please try again!\n");
            }
        } while(findInArray(seatReservation, false));

        System.out.println("\n\nNo more seats available for reservation!\nTry another day");
    }

    private static boolean findInArray(boolean[] array, boolean value){
        boolean isInArray = false;
        for (boolean b : array) {
            if (b == value) {
                isInArray = true;
                break;
            }
        }

        return isInArray;
    }
}
