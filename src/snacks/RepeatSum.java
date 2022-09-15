package snacks;

import java.util.Scanner;

public class RepeatSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean again;
        do{
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            System.out.printf("The sum of %d and %d = %d%n%n%n", num1, num2, num1 + num2);

            System.out.print("Do you want to continue?\nPress 1 for yes, 0 for no: ");
            int signal = input.nextInt();
            if(signal == 1){
                again = true;
            } else {
                System.out.println("\nOkay, bye!");
                again = false;
            }
        } while(again);
    }
}
