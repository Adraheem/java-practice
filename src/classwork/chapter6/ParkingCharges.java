package classwork.chapter6;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours parked: ");
        int hours = input.nextInt();

        System.out.printf("Total running of yesterday receipt is $%.2f%n", calculateCharges(hours));
    }

    public static double calculateCharges(int hours){
        if(hours <= 3){
            return 2.00;
        }

        int remainingHours = hours - 3;
        double chargesForRemainingHours = remainingHours * 0.5;

        double nTotal = chargesForRemainingHours + 2.00;
        return nTotal > 10 ? 10.00 : nTotal;
    }
}
