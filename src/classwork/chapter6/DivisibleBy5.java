package classwork.chapter6;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            System.out.printf("%d is divisible by 5: %b%n", num, isDivisibleBy5(num));
        }
    }

    private static boolean isDivisibleBy5(int num){
        return num % 5 == 0;
    }
}
