package classwork.chapter6;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double number: ");
        double num = input.nextDouble();

        System.out.printf("%f is rounded to %d%n", num, Math.round(num));
    }
}
