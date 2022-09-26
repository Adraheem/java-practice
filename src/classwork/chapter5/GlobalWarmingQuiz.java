package classwork.chapter5;

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctAnswer = 0;
        int wrongAnswer = 0;

        String answer;

        for (int question = 1; question <= 5; question++) {
            System.out.println("\n\n"+ "=".repeat(60));
            System.out.println("=".repeat(60));
            System.out.printf("Question %d:%n", question);

            switch (question) {
                case 1 -> {
                    System.out.println("""
                            What is Nigeria Independence Day?
                            A: October 1st, 1960
                            B: May 14, 1914
                            C: June 12, 1960
                            D: December 25, 2000
                            """);
                    System.out.print("Enter your answer: ");
                    answer = input.nextLine();
                    if (answer.trim().equalsIgnoreCase("a")) {
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }
                }
                case 2 -> {
                    System.out.println("""
                            Green is part of Nigeria color
                            A: No
                            B: Yes
                            C: Maybe
                            D: Not sure
                            """);
                    System.out.print("Enter your answer: ");
                    answer = input.nextLine();
                    if (answer.trim().equalsIgnoreCase("b")) {
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }
                }
                case 3 -> {
                    System.out.println("""
                            White is part of Nigeria color
                            A: No
                            B: Yes
                            C: Maybe
                            D: Not sure
                            """);
                    System.out.print("Enter your answer: ");
                    answer = input.nextLine();
                    if (answer.trim().equalsIgnoreCase("b")) {
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }
                }
                case 4 -> {
                    System.out.println("""
                            How many states exist in Nigeria?
                            A: 20
                            B: 35
                            C: 36
                            D: Not sure
                            """);
                    System.out.print("Enter your answer: ");
                    answer = input.nextLine();
                    if (answer.trim().equalsIgnoreCase("c")) {
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }
                }
                case 5 -> {
                    System.out.println("""
                            What continent is Nigeria in?
                            A: Asia
                            B: Australia
                            C: America
                            D: Africa
                            """);
                    System.out.print("Enter your answer: ");
                    answer = input.nextLine();
                    if (answer.trim().equalsIgnoreCase("d")) {
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }
                }
            }
        }

        System.out.println();

        switch (correctAnswer) {
            case 5 -> System.out.println("Excellent");
            case 4 -> System.out.println("Very good");
            default -> System.out.println("Time to brush up on your knowledge of global warming");
        }

        System.out.printf("%nYou got %d correctly and %d wrongly%n", correctAnswer, wrongAnswer);
    }
}
