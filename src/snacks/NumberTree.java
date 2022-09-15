package snacks;

import java.util.Scanner;

public class NumberTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter max tree level: ");
        int number = input.nextInt();

        String tree = "";

        for (int count = 0; count < number; count++) {
            String numString = Integer.toString(count + 1);
            String stars = numString.repeat(count*2 + 1);

            tree += " ".repeat(number - count - 1) + stars + "\n";
        }

        System.out.println(tree);
    }
}
