package tdd;

import java.util.Scanner;

public class TimeTellerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your time in hh:mm -> ");
        String time = scanner.nextLine();

        try {
            System.out.println(TimeTeller.speakTime(time));
        }
        catch (IllegalArgumentException err){
            System.out.println(err.getMessage());
        }
    }
}
