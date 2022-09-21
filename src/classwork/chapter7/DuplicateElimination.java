package classwork.chapter7;

import java.util.Arrays;
import java.util.Scanner;

// (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
//Write an application that inputs ten numbers, each between 10 and 100, both inclusive. Save
//each number that was read in an array that was initialized to a value of -1 for all elements. Assume
//a value of -1 indicates an array element is empty. You are then to process the array, and remove
//duplicate elements from the array containing the numbers you input. Display the contents of the
//array to demonstrate that the duplicate input values were actually removed. [Note: do not display
//the array elements where the value is -1.]
public class DuplicateElimination {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[10];
        Arrays.fill(number, -1);

        for (int count : number) {
            System.out.printf("%d    ", count);
        }

        System.out.println();

        for (int count = 0; count < number.length; count++) {
            System.out.print("Enter a number: ");
            int entry = input.nextInt();

            if (!findIn(number, entry)) {
                number[count] = entry;
            }
        }

        for (int count : number) {
            if (count != -1) {
                System.out.printf("%d   ", count);
            }
        }
    }

    public static boolean findIn(int[] array, int element) {
        boolean response = false;
        for (int j : array) {
            if (j == element) {
                response = true;
                break;
            }
        }
        return response;
    }
}
