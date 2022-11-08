package snacks.classroom;

import java.util.Scanner;

public class ClassroomDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students do you have?");
        int numOfStudents = scanner.nextInt();

        System.out.println("How many subjects do they offer?");
        int numOfSubjects = scanner.nextInt();

        Student[] classroom = new Student[numOfStudents];
        Subject[] subjects = new Subject[numOfSubjects];
        save();

        for (int i = 0; i < numOfStudents; i++) {
            StudentSubject[] studentSubjects = new StudentSubject[numOfSubjects];

            for (int j = 0; j < numOfSubjects; j++) {
                System.out.printf("Entering score for Student %d%n", i + 1);
                System.out.printf("Enter score for subject %d%n", j + 1);
                int score = scanner.nextInt();

                Subject subject = new Subject(j+1);
                StudentSubject studentSubject = new StudentSubject(subject, score);
                studentSubjects[j] = studentSubject;
                subjects[j] = subject;
                save();
            }
            Student student = new Student(i+1, studentSubjects);
            classroom[i] = student;
        }

        Classroom classroomMonitor = new Classroom(classroom, subjects);
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
