package snacks;

import java.util.Scanner;

public class RaisePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = input.nextInt();

        System.out.print("Raised to power: ");
        int num2 = input.nextInt();

        int power = num1;
        for (int i = 1; i < num2; i++) {
            power *= num1;
        }

        System.out.printf("%d raised to the power of %d is %d%n", num1, num2, power);
    }
}
