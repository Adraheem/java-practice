package snacks.classroom;

public class Classroom {
    private final Student[] students;
    private final Subject[] subjects;

    public Classroom(Student[] students, Subject[] subjects) {
        this.students = students;
        this.subjects = subjects;
        for (Subject subject : subjects) {
            subject.setStudents(students);
        }
        this.generateStudentsPosition();
    }

    public String getScoreSheet(){
        StringBuilder report = new StringBuilder();
        int totalStringLength = 50 + subjects.length * 10;
        report.append("=".repeat(totalStringLength));
        report.append("\n");
        report.append(String.format("%-20s", "STUDENT"));
        for (Subject subject : subjects) {
            report.append(String.format("%-10s", subject.getSubjectName()));
        }
        report.append(String.format("%-10s", "TOTAL"));
        report.append(String.format("%-10s", "AVE"));
        report.append(String.format("%-10s", "POS"));
        report.append("\n");
        report.append("=".repeat(totalStringLength));

        for (Student student : students) {
            report.append(String.format("%n%-20s", student.getName()));

            for (StudentSubject studentSubject : student.getSubjects()){
                report.append(String.format("%-10d", studentSubject.getScore()));
            }

            report.append(String.format("%-10d", student.getTotalScore()));
            report.append(String.format("%-10.2f", student.getAverageScore()));
            report.append(String.format("%-10d", student.getPosition()));
        }
        report.append("\n");
        report.append("=".repeat(totalStringLength));
        report.append("\n");
        report.append("=".repeat(totalStringLength));
        return report.toString();
    }

    public String getSubjectSummary(){
        StringBuilder report = new StringBuilder("SUBJECT SUMMARY\n");

        for (Subject subject : subjects){
            Student highestStudent = getHighestStudentInSubject(subject);
            Student lowestStudent = getLowestStudentInSubject(subject);

            report.append(subject.getSubjectName()).append("\n");
            report.append(String.format("Highest scoring student is: %s scoring %d%n", highestStudent.getName(),
                    highestStudent.getSubjectScore(subject)));
            report.append(String.format("Lowest scoring student is: %s scoring %d%n", lowestStudent.getName(),
                    lowestStudent.getSubjectScore(subject)));
            report.append(String.format("Total score is: %d%n", subject.getTotalScore()));
            report.append(String.format("Average score is: %.2f%n", subject.getAverageScore()));
            report.append(String.format("Number of passes: %d%n", subject.getPasses()));
            report.append(String.format("Number of Fails: %d%n%n", subject.getFailures()));
        }

        return report.toString();
    }

    public String getClassSummary(){
        StringBuilder report = new StringBuilder("CLASS SUMMARY\n");
        Student bestGraduatingStudent = getBestGraduatingStudent();
        Student worstGraduatingStudent = getWorstGraduatingStudent();

        report.append("=".repeat(50));
        report.append(String.format("%nBest Graduating Student is: %s scoring %d%n",
                bestGraduatingStudent.getName(), bestGraduatingStudent.getTotalScore()));
        report.append("=".repeat(50)).append("\n\n");

        report.append("!".repeat(50));
        report.append(String.format("%nWorst Graduating Student is: %s scoring %d%n",
                worstGraduatingStudent.getName(), worstGraduatingStudent.getTotalScore()));
        report.append("!".repeat(50)).append("\n\n");

        report.append("=".repeat(50));
        report.append(String.format("%nClass total score is: %d%n", getClassTotalScore()));
        report.append(String.format("%nClass average score is: %.2f%n", getClassAverageScore()));
        report.append("=".repeat(50)).append("\n\n");

        return report.toString();
    }

    private int getClassTotalScore(){
        int totalScore = 0;
        for (Student student : students){
            totalScore += student.getTotalScore();
        }
        return totalScore;
    }

    private double getClassAverageScore(){
        return (double) getClassTotalScore() / (double) students.length;
    }

    private Student getBestGraduatingStudent(){
        Student bestGraduatingStudent = students[0];

        for(Student student : students){
            if (student.getTotalScore() > bestGraduatingStudent.getTotalScore()){
                bestGraduatingStudent = student;
            }
        }
        return bestGraduatingStudent;
    }

    private Student getWorstGraduatingStudent(){
        Student worstGraduatingStudent = students[0];

        for(Student student : students){
            if (student.getTotalScore() < worstGraduatingStudent.getTotalScore()){
                worstGraduatingStudent = student;
            }
        }
        return worstGraduatingStudent;
    }

    private Student getHighestStudentInSubject(Subject subject) {
        Student highestStudent = students[0];

        for(Student student : students){
            if (student.getSubjectScore(subject) >  highestStudent.getSubjectScore(subject)){
                highestStudent = student;
            }
        }
        return highestStudent;
    }

    private Student getLowestStudentInSubject(Subject subject) {
        Student lowestStudent = students[0];

        for(Student student : students){
            if (student.getSubjectScore(subject) <  lowestStudent.getSubjectScore(subject)){
                lowestStudent = student;
            }
        }
        return lowestStudent;
    }

    private void generateStudentsPosition(){
        for (Student student : this.students) {
            int studentPosition = getStudentPosition(student.getTotalScore());
            student.setPosition(studentPosition);
        }
    }

    private int getStudentPosition(int studentTotalScore){
        int[] totals = new int[this.students.length];
        for (int i = 0; i < this.students.length; i++) {
            totals[i] = this.students[i].getTotalScore();
        }
        sortNumbersDescending(totals);

        int position = 0;
        for (int i = 0; i < totals.length; i++) {
            if(studentTotalScore == totals[i]){
                position = i + 1;
                break;
            }
        }
        return position;
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
}
