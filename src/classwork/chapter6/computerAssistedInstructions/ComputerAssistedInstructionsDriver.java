package classwork.chapter6.computerAssistedInstructions;

import java.util.Scanner;

public class ComputerAssistedInstructionsDriver {
    public static void main(String[] args) {
        ComputerAssistedInstructions computer = new ComputerAssistedInstructions();
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Choose a difficulty level:
                1 -> Easy
                2 -> Intermediate
                3 -> Pro
                4 -> Master
                5 -> Agba
                """);
        int difficultyLevel = input.nextInt();
        computer.setDifficultyLevel(difficultyLevel);

        System.out.println("""
                Choose arithmetic problem:
                1 -> Addition
                2 -> Subtraction
                3 -> Multiplication
                """);
        int operation = input.nextInt();
        computer.setArithmeticProblem(operation);

        int continueGame;
        int count = 0;
        do {
            System.out.println(computer.generateQuestion());

            while (true) {
                count++;

                int value = input.nextInt();
                if(value == computer.getAnswer()){
                    computer.incrementCorrectResponse();
                    System.out.println(computer.getCorrectResponse());
                    break;
                } else {
                    computer.incrementIncorrectResponse();
                    System.out.println(computer.getIncorrectResponse());
                }
                if (count == 10) break;
                System.out.println(computer.getQuestion());
            }

            if(count == 10){
                System.out.println(computer.calculateReport());
                break;
            }

            System.out.println("Press 1 to continue the game, 0 to quit");
            continueGame = input.nextInt();
        } while (continueGame == 1);
    }
}
