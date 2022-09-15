package snacks;

public class SumFirstTenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.printf("The sum of first 10 numbers is %d", sum);
    }
}
