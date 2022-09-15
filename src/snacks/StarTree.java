package snacks;

import java.util.Scanner;

public class StarTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter max tree level: ");
        int number = input.nextInt();

        String tree = "";

        for (int count = 1; count <= number; count++) {
            String stars = "*";
            for (int i = 1; i < count; i++) {
                stars = stars + "*";
                stars = stars + "*";
            }
            tree += " ".repeat(number - count) + stars + "\n";
        }

        System.out.println(tree);
    }
}
