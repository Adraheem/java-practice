package practice.turtleGraphics;

public class SketchPad {
    private int width;
    private int height;
    private int[][] data;

    public SketchPad(int width, int height){
        this.width = width;
        this.height = height;
        data = new int[width][height];
    }

    public void writeToCell(int row, int column){
        if (row < height && column < width) {
            data[row][column] = 1;
        }
    }

    public String display(){
        String result = "";
        for(int[] row : data){
            for(int cell : row){
                result += cell == 0 ? "   " : " * ";
            }
            result += "\n";
        }
        return result;
    }
}
