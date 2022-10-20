package snacks;

import java.security.SecureRandom;

public class SortArray {
    private final SecureRandom secureRandom = new SecureRandom();

    public int[] sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public int[] sortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public int[] shuffle(int[] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);

        for (int i = 0; i < newArray.length; i++) {
            int random = secureRandom.nextInt(newArray.length);

            int temp = newArray[i];
            newArray[i] = newArray[random];
            newArray[random] = temp;
        }

        return newArray;
    }

    public int[] generateArray(int length){
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }

        return array;
    }
}
