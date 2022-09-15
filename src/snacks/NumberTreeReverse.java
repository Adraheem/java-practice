package snacks;

import java.util.Scanner;

public class NumberTreeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter max tree level from 1 - 9: ");
            int number = input.nextInt();

            if (number < 1 || number > 9) {
                System.out.println("Number not allowed, enter number between 1 - 9");
            } else {

                String tree = "";

                for (int count = 1; count <= number; count++) {
                    String numbers = "";
                    for (int i = count; i >= 2; i--) {
                        numbers = numbers + Integer.toString(i);
                    }

                    numbers += "1";

                    for (int i = 2; i <= count; i++) {
                        numbers = numbers + Integer.toString(i);
                    }
                    tree += " ".repeat(number - count) + numbers + "\n";
                }

                System.out.println(tree);
                break;
            }
        }
    }
}
