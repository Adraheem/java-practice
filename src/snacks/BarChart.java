package snacks;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String chart = "";

        for (int count = 0; count < 5; count++) {
            System.out.print("Enter a number within the range of 1 - 30: ");
            int num = input.nextInt();
            String stars = "";
            for (int i = 0; i < num; i++) {
                stars = stars + "*";
            }
            chart = chart + num + " - " +  stars + "\n";
        }

        System.out.println(chart);
    }
}
