package tdd;

import java.util.Scanner;

public class TimeTellerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter your time in hh:mm -> ");
            String time = scanner.nextLine();

            try {
                System.out.println("=>> " + TimeTeller.speakTime(time));
                break;
            } catch (IllegalArgumentException err) {
                System.out.println(err.getMessage() + "\n");
            }
        }
    }
}
