package classwork.chapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("The greatest common divisor (GCD) is "+ getHighestCommonFactor(num1, num2));
    }

    private static int getHighestCommonFactor(int num1, int num2){
        int leastNumber = Math.min(num1, num2);
        int hcf = 1;
        for (int i = 1; i < leastNumber; i++) {
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }
}
