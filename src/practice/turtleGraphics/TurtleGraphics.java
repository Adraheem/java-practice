package practice.turtleGraphics;

public class TurtleGraphics {
    private Pen pen;
    private Direction currentDirection;
    private Position currentPosition;
    private SketchPad sketchPad;

    public TurtleGraphics(){
        pen = new Pen();
        pen.penUp();
        currentDirection = Direction.EAST;
        currentPosition = new Position(0,0);
        sketchPad = new SketchPad(20,20);
    }

    public Pen getPen() {
        return pen;
    }

    public void penUp() {
        pen.penUp();
    }

    public boolean isPenUp() {
        return pen.isPenUp();
    }

    public void penDown() {
        pen.penDown();
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> {
                currentDirection = Direction.SOUTH;
            }
            case SOUTH -> {
                currentDirection = Direction.WEST;
            }
            case WEST -> {
                currentDirection = Direction.NORTH;
            }
            case NORTH -> {
                currentDirection = Direction.EAST;
            }
        }
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        switch(currentDirection){
            case EAST -> {
                currentDirection = Direction.NORTH;
            }
            case NORTH -> {
                currentDirection = Direction.WEST;
            }
            case WEST -> {
                currentDirection = Direction.SOUTH;
            }
            case SOUTH -> {
                currentDirection = Direction.EAST;
            }
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void move(int numberOfSteps) {
        switch(currentDirection){
            case EAST -> {
                if(!this.isPenUp()){
                    int startColumn = currentPosition.getColumn();
                    int endColumn = currentPosition.getColumn() + numberOfSteps - 1;

                    for (int i = startColumn; i <= endColumn; i++) {
                        sketchPad.writeToCell(currentPosition.getRow(), i);
                    }
                }
                currentPosition = new Position(currentPosition.getRow(),
                        currentPosition.getColumn() + numberOfSteps - 1);
            }
            case SOUTH -> {
                if (!this.isPenUp()){
                    int startRow = currentPosition.getRow();
                    int endRow = currentPosition.getRow() + numberOfSteps - 1;

                    for (int i = startRow; i <= endRow; i++) {
                        sketchPad.writeToCell(i, currentPosition.getColumn());
                    }
                }
                currentPosition = new Position(
                        currentPosition.getRow() + numberOfSteps - 1,
                        currentPosition.getColumn());
            }
            case WEST -> {
                if (!this.isPenUp()){
                    int startColumn = currentPosition.getColumn();
                    int endColumn = currentPosition.getColumn() - (numberOfSteps - 1);

                    for (int i = startColumn; i >= endColumn; i--) {
                        sketchPad.writeToCell(currentPosition.getRow(), i);
                    }
                }
                currentPosition = new Position(currentPosition.getRow(),
                        currentPosition.getColumn() - (numberOfSteps - 1));
            }
            case NORTH -> {
                if (!this.isPenUp()){
                    int startRow = currentPosition.getRow();
                    int endRow = currentPosition.getRow() - (numberOfSteps - 1);

                    for (int i = startRow; i >= endRow; i--) {
                        sketchPad.writeToCell(i, currentPosition.getColumn());
                    }
                }
                currentPosition = new Position(currentPosition.getRow() - (numberOfSteps - 1),
                        currentPosition.getColumn());
            }
        }
    }

    public SketchPad getSketchPad() {
        return sketchPad;
    }

    public String displaySketchPad() {
        return sketchPad.display();
    }
}
