package snacks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean isPrime = false;
        for (int count = 2; count < num; count++) {
            if(num % count == 0){
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }

        System.out.printf("%d is %s prime number", num, isPrime ? "a" : "NOT a");
    }
}
