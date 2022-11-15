package turtleGraphics;

public class Board {
    private final int numberOfRows;
    private final int numberOfColumns;
    private final int[][] table;

    public Board(int numberOfRows, int numberOfColumns){
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        table = new int[numberOfRows][numberOfColumns];
    }

    public void writeTo(int row, int column){
        if (!(row < 0 || row >= numberOfRows || column < 0 || column >= numberOfColumns)){
            table[row][column] = 1;
        }
    }

    public String getTable(){
        StringBuilder result = new StringBuilder();
        for(int[] row : table){
            for(int cell : row){
                result.append(cell == 0 ? "   " : " * ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
