package snacks;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aGrade = 0;
        int bGrade = 0;
        int cGrade = 0;
        int dGrade = 0;

        StringBuilder report = new StringBuilder();

        for (int count = 0; count < 5; count++) {
            System.out.print("\nEnter student name: ");
            String name = input.nextLine();

            System.out.print("Enter student grade: ");
            String grade = input.nextLine();

            report.append(name).append(": ").append(grade).append("\n");

            switch(grade){
                case "A":
                    aGrade++;
                    break;
                case "B":
                    bGrade++;
                    break;
                case "C":
                    cGrade++;
                    break;
                default:
                    dGrade++;
                    break;
            }
        }

        System.out.println("\n");
        System.out.println(report);

        System.out.printf("A: %d%n", aGrade);
        System.out.printf("B: %d%n", bGrade);
        System.out.printf("C: %d%n", cGrade);
        System.out.printf("D: %d%n", dGrade);
    }
}
