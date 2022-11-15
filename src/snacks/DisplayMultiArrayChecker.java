package snacks;

public class DisplayMultiArrayChecker {
    public static void main(String[] args) {
        int[][] table = new int[10][10];

        table[0][0] = 1;
        table[1][1] = 1;
        table[2][2] = 1;
        table[3][3] = 1;
        table[4][4] = 1;
        table[5][5] = 1;
        table[6][6] = 1;
        table[7][7] = 1;
        table[8][8] = 1;
        table[9][9] = 1;
        System.out.println(display(table));

    }
    private static String display(int[][] table){
        String result = "";
        for(int[] row : table){
            for(int cell : row){
                result += cell == 0 ? " - " : " * ";
            }
            result += "\n";
        }
        return result;
    }
}
