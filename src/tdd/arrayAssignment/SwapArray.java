package tdd.arrayAssignment;

public class SwapArray {

    public static int[] swap(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        return array;
    }
}
