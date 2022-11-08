package snacks.classroom;

public class Subject {
    private final int subjectId;
    private final String subjectName;
    private int passes;
    private int failures;
    private int totalScore;
    private double averageScore;

    public Subject(int subjectId) {
        this.subjectId = subjectId;
        this.subjectName = "SUB "+ subjectId;
    }

    public void setStudents(Student[] students) {
        int total = 0;
        for (Student student : students) {
            int score = student.getSubjectScore(this);
            total += score;
            if(score >= 50){
                passes++;
            } else {
                failures++;
            }
        }
        this.totalScore = total;
        this.averageScore = (double) total / (double) students.length;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getPasses() {
        return passes;
    }

    public int getFailures() {
        return failures;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public double getAverageScore() {
        return averageScore;
    }
}
