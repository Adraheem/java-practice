package ahneeka;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number1");
        double value = input.nextDouble();
        System.out.println("enter a number2");
        double number = input.nextDouble();

        boolean isMultiple = (value * 3) % (number * 2)==0;
        System.out.printf("the answer is %b",isMultiple );

    }
}
