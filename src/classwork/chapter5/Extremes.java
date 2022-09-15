package classwork.chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to add? ");
        int count = input.nextInt();

        int minNum = 0;
        int maxNum = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number" + (i+1) + ": ");
            int num = input.nextInt();

            if(i==0){
                minNum = num;
                maxNum = num;
            } else {
                minNum = Math.min(minNum, num);
                maxNum = Math.max(maxNum, num);
            }
        }

        System.out.printf("The max number is: %d%nThe min number is %d%nThe sum of the extreme numbers is %d%n", maxNum, minNum, (maxNum+minNum));
    }
}
