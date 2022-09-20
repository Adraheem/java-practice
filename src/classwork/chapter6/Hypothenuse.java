package classwork.chapter6;

import java.util.Scanner;

public class Hypothenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();

        double hyp = Math.sqrt(Math.pow(side1, 2) * Math.pow(side2, 2));
        System.out.printf("The hypothenuse of the triangle is %.2f%n", hyp);
    }
}
