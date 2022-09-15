package classwork.chapter5;

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctAnswer = 0;
        int wrongAnswer = 0;

        String answer = "";

        for (int question = 1; question <= 5; question++) {
            System.out.println("\n\n"+ "=".repeat(80));
            System.out.printf("Question %d:%n", question);

            switch(question){
                case 1:
                    System.out.println("What is Nigeria Independence Day?");
                    System.out.println("A: October 1st, 1960");
                    System.out.println("B: May 14, 1914");
                    System.out.println("C: June 12, 1960");
                    System.out.println("D: December 25, 2000");
                    System.out.print("\nEnter your answer: ");
                    answer = input.nextLine();
                    if(answer.trim().equalsIgnoreCase("a")){
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }
                    break;
                case 2:
                    System.out.println("Green is part of Nigeria color");
                    System.out.println("A: No");
                    System.out.println("B: Yes");
                    System.out.println("C: Maybe");
                    System.out.println("D: Not sure");
                    System.out.print("\nEnter your answer: ");
                    answer = input.nextLine();
                    if(answer.trim().equalsIgnoreCase("b")){
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }
                    break;
                case 3:
                    System.out.println("White is part of Nigeria color");
                    System.out.println("A: No");
                    System.out.println("B: Yes");
                    System.out.println("C: Maybe");
                    System.out.println("D: Not sure");
                    System.out.print("\nEnter your answer: ");
                    answer = input.nextLine();
                    if(answer.trim().equalsIgnoreCase("b")){
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }
                    break;
                case 4:
                    System.out.println("How many states exist in Nigeria?");
                    System.out.println("A: 20");
                    System.out.println("B: 35");
                    System.out.println("C: 36");
                    System.out.println("D: Not sure");
                    System.out.print("\nEnter your answer: ");
                    answer = input.nextLine();
                    if(answer.trim().equalsIgnoreCase("c")){
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }
                    break;
                case 5:
                    System.out.println("What continent is Nigeria in?");
                    System.out.println("A: Asia");
                    System.out.println("B: Australia");
                    System.out.println("C: America");
                    System.out.println("D: Africa");
                    System.out.print("\nEnter your answer: ");
                    answer = input.nextLine();
                    if(answer.trim().equalsIgnoreCase("d")){
                        correctAnswer++;
                    } else {
                        wrongAnswer++;
                    }
                    break;
            }
        }

        System.out.println();

        switch(correctAnswer){
            case 5:
                System.out.println("Excellent");
                break;
            case 4:
                System.out.println("Very good");
                break;
            default:
                System.out.println("Time to brush up on your knowledge of global warming");
                break;
        }

        System.out.printf("%nYou got %d correctly and %d wrongly%n", correctAnswer, wrongAnswer);
    }
}
