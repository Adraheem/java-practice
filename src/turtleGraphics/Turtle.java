package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private final Pen pen;
    private Direction currentDirection;
    private final Position currentPosition;
    private final Board board;

    public Turtle(){
        pen = new Pen();
        pen.penUp();
        currentDirection = EAST;
        currentPosition = new Position(0,0);
        int BOARD_SIZE = 20;
        board = new Board(BOARD_SIZE, BOARD_SIZE);
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

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        this.currentDirection = switch (currentDirection) {
            case NORTH -> EAST;
            case EAST -> SOUTH;
            case SOUTH -> WEST;
            case WEST -> NORTH;
        };
    }

    public void turnLeft() {
        this.currentDirection = switch (currentDirection) {
            case NORTH -> WEST;
            case EAST -> NORTH;
            case SOUTH -> EAST;
            case WEST -> SOUTH;
        };
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void move(int numberOfSteps) {
        switch (currentDirection) {
            case EAST -> {
                if (!this.isPenUp()){
                    for (int i = currentPosition.getColumn(); i < currentPosition.getColumn() + numberOfSteps; i++) {
                        board.writeTo(currentPosition.getRow(), i);
                    }
                }
                currentPosition.setColumn(currentPosition.getColumn() + (numberOfSteps - 1));
            }
            case WEST -> {
                if (!this.isPenUp()){
                    for (int i = currentPosition.getColumn(); i > currentPosition.getColumn() - numberOfSteps; i--) {
                        board.writeTo(currentPosition.getRow(), i);
                    }
                }
                currentPosition.setColumn(currentPosition.getColumn() - (numberOfSteps - 1));
            }
            case NORTH -> {
                if (!this.isPenUp()){
                    for (int i = currentPosition.getRow(); i > currentPosition.getRow() - numberOfSteps; i--) {
                        board.writeTo(i, currentPosition.getColumn());
                    }
                }
                currentPosition.setRow(currentPosition.getRow() - (numberOfSteps - 1));
            }
            case SOUTH -> {
                if (!this.isPenUp()){
                    for (int i = currentPosition.getRow(); i < currentPosition.getRow() + numberOfSteps; i++) {
                        board.writeTo(i, currentPosition.getColumn());
                    }
                }
                currentPosition.setRow(currentPosition.getRow() + (numberOfSteps - 1));
            }
        }
    }

    public String displayBoard() {
        return board.getTable();
    }
}
