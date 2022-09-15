package classwork.chapter5;

public class SumOfASeries {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += j;
            }
            System.out.printf("%d       %d%n", i, sum);
        }
    }
}
