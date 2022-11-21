package practice.turtleGraphics;

public class Pen {
    private boolean isPenUp;

    public void penUp() {
        isPenUp = true;
    }

    public void penDown() {
        isPenUp = false;
    }

    public boolean isPenUp() {
        return isPenUp;
    }
}
