package practice.sevenSegmentDisplay;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        String choice = input("""
                Welcome to my Seven Segment Display
                1 -> binary code
                2 -> enter digit
                3 -> exit;
                """);

        switch (choice) {
            case "1" -> enterBinaryCode();
            case "2" -> enterDigit();
            case "3" -> exit(0);
        }
    }

    private static void enterDigit() {
        while (true) {
            System.out.println("Enter a digit from 0 - 9 to display or -1 to quit: ");
            String binary = scanner.next();

            if (binary.equals("-1")) break;

            System.out.println(sevenSegmentDisplay.render(binary));
        }
        mainMenu();
    }

    private static void enterBinaryCode() {
        while (true) {
            System.out.println("Enter a binary code of 8 characters to display or -1 to quit: ");
            String binary = scanner.next();

            if (binary.equals("-1")) break;

            System.out.println(sevenSegmentDisplay.display(binary));
        }
        mainMenu();
    }

    private static void print(String display) {
        System.out.println(display);
    }

    private static String input(String prompt) {
        print(prompt);
        return scanner.next();
    }
}
