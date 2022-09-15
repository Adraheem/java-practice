package snacks;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minNumber = 0;
        int maxNumber = 0;

        int count = 1;
        while(count > 0){
            System.out.print("Enter a number or -1 to exit: ");
            int num = input.nextInt();

            if(num == -1){
                break;
            } else {
                if(count == 1){
                    minNumber = num;
                    maxNumber = num;
                }
                else {
                    if (num < minNumber) {
                        minNumber = num;
                    }
                    if (num > maxNumber){
                        maxNumber = num;
                    }
                }
            }
            count++;
        }

        System.out.printf("Minimum number: %d%nMaximum number: %d%n", minNumber, maxNumber);
    }
}
