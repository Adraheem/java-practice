package classwork.chapter6;

import java.util.Scanner;

public class CheckMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.printf("%d is %sa multiple of %d%n", num2, num2%num1==0 ? "" : "NOT ", num1);
    }
}
