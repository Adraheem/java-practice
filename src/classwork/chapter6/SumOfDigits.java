package classwork.chapter6;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a four digit number: ");
        int number = input.nextInt();

        System.out.println(addDigits(number));
    }

    private static int addDigits(int number){
        int num1 = number / 1000;
        int num2 = (number % 1000) / 100;
        int num3 = ((number % 1000) % 100) / 10;
        int num4 = ((number % 1000) % 100) % 10;

        return num1 + num2 + num3 + num4;
    }
}
