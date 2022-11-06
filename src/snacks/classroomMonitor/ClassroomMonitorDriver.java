package snacks.classroomMonitor;

import java.util.Scanner;

public class ClassroomMonitorDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students do you have?");
        int numOfStudents = scanner.nextInt();

        System.out.println("How many subjects do they offer?");
        int numOfSubjects = scanner.nextInt();

        int[][] classroom = new int[numOfStudents][numOfSubjects];
        save();

        for (int i = 0; i < numOfStudents; i++) {
            for (int j = 0; j < numOfSubjects; j++) {
                System.out.printf("Entering score for Student %d%n", i + 1);
                System.out.printf("Enter score for subject %d%n", j + 1);
                int score = scanner.nextInt();

                classroom[i][j] = score;
                save();
            }
        }

        ClassroomMonitor classroomMonitor = new ClassroomMonitor(classroom);
        System.out.println();
        System.out.println(classroomMonitor.getScoreSheet());
        System.out.println();
        System.out.println(classroomMonitor.getSubjectSummary());
        System.out.println();
        System.out.println(classroomMonitor.getClassSummary());
    }

    private static void save(){
        System.out.println("Saving >>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
        System.out.println();
    }
}
