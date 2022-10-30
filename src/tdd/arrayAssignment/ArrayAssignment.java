package tdd.arrayAssignment;

import java.util.Arrays;

public class ArrayAssignment {

    public int largestElementInArray(int[] numbers) {
        int largestElement = 0;
        for(int number : numbers) {
            if (number > largestElement){
                largestElement = number;
            }
        }
        return largestElement;
    }

    public int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

    public boolean isInArray(int[] numbers, int element) {
        boolean result = false;
        for (int number : numbers) {
            if (number == element){
                result = true;
                break;
            }
        }
        return result;
    }

    public int[] oddPositionElements(int[] original) {
        int[] oddPositionElements = new int[(int) Math.ceil((double) original.length / 2)];
        int oddCounter = 0;
        for (int i = 0; i < original.length; i+=2) {
            oddPositionElements[oddCounter++] = original[i];
        }
        return oddPositionElements;
    }

    public int[] evenPositionElements(int[] original) {
        int[] evenPositionElements = new int[original.length/2];
        int evenCounter = 0;
        for (int i = 1; i < original.length; i+=2) {
            evenPositionElements[evenCounter++] = original[i];
        }
        return evenPositionElements;
    }

    public int sumElements(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public boolean isPalindrome(String text) {
        String[] textArray = text.replaceAll("\s|(-)|(')|(\")", "").split("");
        String[] textArrayReverse = new String[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            textArrayReverse[i] = textArray[textArray.length - 1 - i];
        }
        return Arrays.equals(textArray, textArrayReverse);
    }

    public int sumElementsWithWhile(int[] numbers) {
        int total = 0;
        int count = 0;
        while (count < numbers.length){
            total += numbers[count++];
        }
        return total;
    }

    public int sumElementsWithDoWhile(int[] numbers) {
        int total = 0;
        int count = 0;
        do {
            total += numbers[count++];
        } while (count < numbers.length);
        return total;
    }

    public Object[] concatenateAlternate(int[] array1, String[] array2) {
        int length = Math.max(array1.length, array2.length);
        Object[] outcome = new Object[array1.length + array2.length];
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (i < array1.length) {
                outcome[counter++] = array1[i];
            }
            if (i < array2.length) {
                outcome[counter++] = array2[i];
            }
        }
        return outcome;
    }

    public Object[] concatenate(int[] array1, String[] array2) {
        Object[] outcome = new Object[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            outcome[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            outcome[array1.length + i] = array2[i];
        }
        return outcome;
    }

    public int[] splitDigits(int number) {
        String[] digitStrings = String.valueOf(number).split("");
        int[] digits = new int[digitStrings.length];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(digitStrings[i]);
        }
        return digits;
    }
}
