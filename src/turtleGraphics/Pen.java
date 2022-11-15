package turtleGraphics;

public class Pen {
    private boolean isPenUp;

    public void penUp() {
        this.isPenUp = true;
    }

    public void penDown() {
        this.isPenUp = false;
    }

    public boolean isPenUp() {
        return isPenUp;
    }
}
