package David;
import java.util.InputMismatchException;
import java.util.Scanner;
public class LetterGrade {
    public static void main(String []args){
        int total = 0;
        int counter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n", "Enter the grades in the range 1 - 100.");
        int grade = 0;

        while(input.hasNext()){
            try{
                grade = input.nextInt();
            }catch (IllegalArgumentException | InputMismatchException e){
                System.out.println(e.getMessage());
            }

            total += grade;
            ++counter;

            switch(grade / 10){
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
            }

        }

        System.out.println("%nGrade Report: %n");

        if(counter != 0){
            double average = (double) total / counter;

            System.out.printf("Total of the %d grades entered is: %d%n", counter, total);
            System.out.printf("Class average is: %.2f%n", average);

            System.out.printf("%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%n",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        }
        else System.out.println("No grades were entered!!!");
    }
    private static void validateGrade(int grade){
        boolean isGrade = grade < 0 || grade > 100;
        if(isGrade) throw new IllegalArgumentException("Grade must be 1 - 100");
    }
    private static void validateGrade2(int grade){
        throw new InputMismatchException("Input mismatch");
    }
}
