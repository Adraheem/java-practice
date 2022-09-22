package classwork.chapter6.computerAssistedInstructions;

import java.security.SecureRandom;

public class ComputerAssistedInstructions {
    private enum Arith {ADDITION, SUBTRACTION, MULTIPLICATION}
    private final SecureRandom secureRandom = new SecureRandom();
    private int num1;
    private int num2;
    private int answer;
    private int correctResponse;
    private int incorrectResponse;
    private int bound;
    private Arith operation;

    public String generateQuestion(){
        num1 = secureRandom.nextInt(bound) + 1;
        num2 = secureRandom.nextInt(bound) + 1;

        switch (operation){
            case ADDITION -> answer = num1 + num2;
            case SUBTRACTION -> answer = num1 - num2;
            default -> answer = num1 * num2;
        }

        return getQuestion();
    }

    public String getQuestion(){
        String operationText = switch(operation){
            case ADDITION -> " plus ";
            case SUBTRACTION -> " minus ";
            default -> " times ";
        };
        return "What is " + num1 + operationText + num2 + "?";
    }

    public int getAnswer(){
        return answer;
    }

    public String getCorrectResponse(){
        int response = secureRandom.nextInt(4) + 1;
        return switch (response) {
            case 1 -> "Very good!";
            case 2 -> "Excellent!";
            case 3 -> "Nice work!";
            default -> "Keep up the good work!";
        };
    }

    public String getIncorrectResponse(){
        int response = secureRandom.nextInt(4) + 1;
        return switch (response) {
            case 1 -> "No. Please try again.";
            case 2 -> "Wrong. Try once more.";
            case 3 -> "Don't give up!";
            default -> "No. Keep trying.";
        };
    }

    public void incrementCorrectResponse(){
        correctResponse++;
    }

    public void incrementIncorrectResponse(){
        incorrectResponse++;
    }

    public String calculateReport(){
        double percentage = ((double) correctResponse / (correctResponse + incorrectResponse)) * 100;

        if(percentage >= 75){
            return "Congratulations, you are ready to go to the next level!";
        } else {
            return "Please ask your teacher for extra help.";
        }
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.bound = (int) Math.pow(10, difficultyLevel) - 1;
    }

    public void setArithmeticProblem(int operation) {
        this.operation = switch (operation) {
            case 1 -> Arith.ADDITION;
            case 2 -> Arith.SUBTRACTION;
            default -> Arith.MULTIPLICATION;
        };
    }
}
