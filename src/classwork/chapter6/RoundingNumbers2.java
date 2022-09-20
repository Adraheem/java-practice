package classwork.chapter6;

import java.util.Scanner;

public class RoundingNumbers2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double number: ");
        double num = input.nextDouble();

        roundToInteger(num);
        roundToTenths(num);
        roundToHundredths(num);
        roundToThousandths(num);
    }

    private static void roundToInteger (double num){
        System.out.printf("%f rounded to integer is %d%n", num, Math.round(num));
    }

    private static void roundToTenths (double num){
        System.out.printf("%f rounded to tenths is %f%n", num, Math.floor(num * 10 + 0.5)/10);
    }
    private static void roundToHundredths(double num){
        System.out.printf("%f rounded to tenths is %f%n", num, Math.floor(num * 100 + 0.5)/100);
    }
    private static void roundToThousandths (double num){
        System.out.printf("%f rounded to tenths is %f%n", num, Math.floor(num * 1000 + 0.5)/1000);
    }
}
