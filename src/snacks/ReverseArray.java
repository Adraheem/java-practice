package snacks;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numArray = {1,2,3,4,5,6,7,8,9,10};
        int[] numArrayReversed = reverse(numArray);

        printArray(numArray, "Original array");
        printArray(numArrayReversed, "Reversed array");
    }

    private static int[] reverse(int[] array){
        int arrayLength = array.length;
        int[] newArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = array[arrayLength - 1 - i];
        }

        return newArray;
    }

    private static void printArray(int[] array, String title){
        System.out.println(title);
        for (int j : array) {
            System.out.printf("%d ", j);
        }
        System.out.println();
        System.out.println();
    }
}
