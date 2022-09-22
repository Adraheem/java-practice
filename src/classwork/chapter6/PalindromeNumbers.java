package classwork.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check if it is a palindrome number: ");
        int number = input.nextInt();

        System.out.printf("%d is%s a palindrome number%n", number, isPalindrome(number) ? "" : " NOT");
    }

    private static boolean isPalindrome(int number){
        String[] numString = Integer.toString(number).split("");
        int numLength = numString.length;
        String[] newNumString = new String[numLength];

        for (int i = 0; i < numLength; i++) {
            newNumString[numLength - 1 - i] = numString[i];
        }

        return Arrays.equals(numString, newNumString);
    }
}
