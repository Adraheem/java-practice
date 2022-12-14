package classwork.chapter7;

public class ArraySumDriver {
    public static void main(String[] args) {
        /*
            Pseudocode
            -> initialize the array with values
            -> declare sum and initialize with 0
            -> for each of the numbers in the array
            -> add the number to the initial value of sum
            -> print the sum at the end of the loop
         */

        int[] array = {34,73, 33, 23, 11, 37, 54, 86, 45, 22, 35, 24, 100};

        System.out.printf("The total is %d%n", ArraySum.addNumbers(array));
    }
}
