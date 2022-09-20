package classwork.chapter6;

import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.printf("%d is a leap year: %b%n", year, isLeapYear(year));
    }

    private static boolean isLeapYear(int year){
        return LocalDate.of(year, 1, 1).isLeapYear();
    }
}
