package classwork.chapter7;

public class ArraySum {
    public static void main(String[] args) {
        // initialize the array with values
        int[] array = {34,73, 33, 23, 11, 37, 54, 86, 45, 22, 35, 24};

        // declare sum and initialize with 0
        int sum = 0;
        System.out.print("\nThe sum of ");

        // for each of the numbers in the array
        for(int i = 0; i < array.length; i++){
            int num = array[i];
            System.out.print(num + ((i == array.length - 1) ? " " : ", "));

            // add the number to the initial value of sum
            sum += num;
        }

        // print the sum at the end of the loop
        System.out.printf("is %d%n", sum);
    }
}
