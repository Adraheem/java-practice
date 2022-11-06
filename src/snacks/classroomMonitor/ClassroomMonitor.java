package snacks.classroomMonitor;

import java.util.Arrays;

public class ClassroomMonitor {
    private final int[][] classroom;
    // {position, studentID, studentTotal}
    private int[] bestGraduatingStudent;
    private int[] worstGraduatingStudent;
    public ClassroomMonitor(int[][] classroom) {
        this.classroom = classroom;
    }

    public String getScoreSheet(){
        StringBuilder report = new StringBuilder();
        int totalStringLength = 50 + classroom[0].length * 10;
        report.append("=".repeat(totalStringLength));
        report.append("\n");
        report.append(String.format("%-20s", "STUDENT"));
        for (int i = 0; i < classroom[0].length; i++) {
            report.append(String.format("%-10s", "SUB" + (i + 1)));
        }
        report.append(String.format("%-10s", "TOTAL"));
        report.append(String.format("%-10s", "AVE"));
        report.append(String.format("%-10s", "POS"));
        report.append("\n");
        report.append("=".repeat(totalStringLength));
        int worstStudentPosition = 0;
        for (int i = 0; i < classroom.length; i++) {
            int[] student = classroom[i];
            int studentTotal = sumNumbers(student);
            double studentAverage = getAverage(student);
            int position = getStudentPosition(studentTotal);
            report.append(String.format("%n%-20s", "Student "+ (i + 1)));

            for (int score : student) {
                report.append(String.format("%-10d", score));
            }

            if(position == 1){
                bestGraduatingStudent = new int[] {position, i, studentTotal};
            }
            if (i == 0){
                worstStudentPosition = position;
            }
            if (position >= worstStudentPosition){
                worstGraduatingStudent = new int[] {position, i, studentTotal};
            }

            report.append(String.format("%-10d", studentTotal));
            report.append(String.format("%-10.2f", studentAverage));
            report.append(String.format("%-10d", position));
        }
        report.append("\n");
        report.append("=".repeat(totalStringLength));
        report.append("\n");
        report.append("=".repeat(totalStringLength));
        return report.toString();
    }

    public String getSubjectSummary(){
        StringBuilder report = new StringBuilder("SUBJECT SUMMARY\n");
        int[][] subjects = new int[classroom[0].length][classroom.length];
        for (int i = 0; i < classroom[0].length; i++) {
            for (int j = 0; j < classroom.length; j++) {
                subjects[i][j] = classroom[j][i];
            }
        }
        // each subject, index -> subject, [0] -> passes, [1] -> failures
        int[][] passFail = new int[subjects.length][2];

        for (int i = 0; i < subjects.length; i++) {
            int[] highest = largestElementInArrayWithPosition(subjects[i]);
            int[] lowest = lowestElementInArrayWithPosition(subjects[i]);
            int total = sumNumbers(subjects[i]);
            double average = getAverage(subjects[i]);
            report.append("Subject ").append(i + 1).append("\n");
            report.append(String.format("Highest scoring student is: Student %d scoring %d%n", highest[1] + 1,
                    highest[0]));
            report.append(String.format("Lowest scoring student is: Student %d scoring %d%n", lowest[1] + 1,
                    lowest[0]));
            report.append(String.format("Total score is: %d%n", total));
            report.append(String.format("Average score is: %.2f%n", average));
            int passes = 0;
            int failures = 0;
            for (int score : subjects[i]){
                if (score >= 50){
                    passes++;
                } else {
                    failures++;
                }
            }
            passFail[i][0] = passes;
            passFail[i][1] = failures;
            report.append(String.format("Number of passes: %d%n", passes));
            report.append(String.format("Number of Fails: %d%n%n", failures));
        }

        int[] passArray = new int[subjects.length];
        for (int i = 0; i < passArray.length; i++) {
            passArray[i] = passFail[i][0];
        }

        int[] failArray = new int[subjects.length];
        for (int i = 0; i < failArray.length; i++) {
            failArray[i] = passFail[i][1];
        }

        int[] pass = largestElementInArrayWithPosition(passArray);
        int[] failures = largestElementInArrayWithPosition(failArray);

        report.append(String.format("%nThe hardest subject is Subject %d with %d failures%n", failures[1] + 1,
                failures[0]));
        report.append(String.format("The easiest subject is Subject %d with %d passes%n", pass[1] + 1, pass[0]));

        int[] highestOverall = getHighestScore();
        int[] lowestOverall = getLowestScore();
        report.append(String.format("The overall Highest score is scored by Student %d in Subject %d scoring %d%n",
                highestOverall[0] + 1, highestOverall[1] + 1, highestOverall[2]));
        report.append(String.format("The overall Lowest score is scored by Student %d in Subject %d scoring %d%n",
                lowestOverall[0] + 1, lowestOverall[1] + 1, lowestOverall[2]));
        report.append("=".repeat(50));
        return report.toString();
    }

    public String getClassSummary(){
        StringBuilder report = new StringBuilder("CLASS SUMMARY\n");

        report.append("=".repeat(50));
        report.append(String.format("%nBest Graduating Student is: Student %d scoring %d%n",
                bestGraduatingStudent[1] + 1, bestGraduatingStudent[2]));
        report.append("=".repeat(50)).append("\n\n");

        report.append("!".repeat(50));
        report.append(String.format("%nWorst Graduating Student is: Student %d scoring %d%n",
                worstGraduatingStudent[1] + 1, worstGraduatingStudent[2]));
        report.append("!".repeat(50)).append("\n\n");

        report.append("=".repeat(50));
        report.append(String.format("%nClass total score is: %d%n", getClassTotalScore()));
        report.append(String.format("%nClass average score is: %.2f%n", getClassAverageScore()));
        report.append("=".repeat(50)).append("\n\n");

        return report.toString();
    }

    private int getClassTotalScore(){
        int total = 0;
        for (int[] student : classroom) {
            total += sumNumbers(student);
        }
        return total;
    }

    private double getClassAverageScore(){
        return (double) getClassTotalScore() / (double) classroom.length;
    }

    private int getStudentPosition(int studentTotal){
        int[] totals = new int[this.classroom.length];
        for (int i = 0; i < classroom.length; i++) {
            totals[i] = sumNumbers(classroom[i]);
        }
        sortNumbersDescending(totals);

        int position = 0;
        for (int i = 0; i < totals.length; i++) {
            if(studentTotal == totals[i]){
                position = i + 1;
                break;
            }
        }
        return position;
    }

    private int sumNumbers(int[] numbers){
        int total = 0;
        for(int number : numbers){
            total += number;
        }
        return total;
    }

    private double getAverage(int[] numbers){
        int total = sumNumbers(numbers);
        return (double)total / (double)numbers.length;
    }

    private void sortNumbersDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static int[] largestElementInArrayWithPosition(int[] numbers) {
        int largestElement = numbers[0];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number > largestElement){
                largestElement = number;
                index = i;
            }
        }
        return new int[] {largestElement, index};
    }

    private static int[] lowestElementInArrayWithPosition(int[] numbers) {
        int lowestElement = numbers[0];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number < lowestElement){
                lowestElement = number;
                index = i;
            }
        }
        return new int[] {lowestElement, index};
    }

    private int[] getHighestScore() {
        int student = 0;
        int subject = 0;
        int highestScore = classroom[0][0];

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                if (classroom[i][j] > highestScore){
                    highestScore = classroom[i][j];
                    student = i;
                    subject = j;
                }
            }
        }

        return new int[] {student, subject, highestScore};
    }

    private int[] getLowestScore() {
        int student = 0;
        int subject = 0;
        int lowestScore = classroom[0][0];

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                if (classroom[i][j] < lowestScore){
                    lowestScore = classroom[i][j];
                    student = i;
                    subject = j;
                }
            }
        }

        return new int[] {student, subject, lowestScore};
    }
}
