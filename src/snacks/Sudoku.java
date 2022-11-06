package snacks;

import java.util.Arrays;

public class Sudoku {
//    public static void main(String[] args) {
//        int[][] sudoku = new int[9][9];
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                int value = i + j + 1;
//                sudoku[i][j] = value > 9 ? value % 10 + 1 : value;
//            }
//        }
//
//        for(int[] row : sudoku){
//            System.out.println(Arrays.toString(row));
//        }
//    }

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
