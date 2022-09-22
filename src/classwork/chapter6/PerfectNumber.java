package classwork.chapter6;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check if it's a perfect number: ");
        int number = input.nextInt();

        System.out.printf("%d is%s a perfect number%n", number, isPerfectNumber(number) ? "" : " NOT");
    }

    private static boolean isPerfectNumber(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }
}
