package snacks.classroom;

public class Student {
    private final String name;
    private final StudentSubject[] studentSubjects;
    private int position;

    public Student(int studentId, StudentSubject[] studentSubjects) {
        this.name = "Student " + studentId;
        this.studentSubjects = studentSubjects;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getTotalScore(){
        int total = 0;
        for (StudentSubject studentSubject : studentSubjects) {
            total += studentSubject.score();
        }
        return total;
    }

    public double getAverageScore() {
        int total = this.getTotalScore();
        return (double) total / (double) studentSubjects.length;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public StudentSubject[] getSubjects() {
        return studentSubjects;
    }

    public int getSubjectScore(Subject subject){
        return studentSubjects[subject.getSubjectId() - 1].score();
    }
}
