package snacks.classroom;

public class StudentSubject {

    private final Subject subject;
    private final int score;

    public StudentSubject(Subject subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }
}
