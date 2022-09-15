package classwork.chapter5;

public class NumbersDivisibleByThree {
    public static void main(String[] args) {
        int sum = 0;
        int start = 1;
        int end = 30;
        int divisor = 3;

        for (int i = start; i < end; i++) {
            if(i % divisor == 0){
                sum += i;
            }
        }

        System.out.printf("The sum of integers between %d and %d is %d%n", start, end, sum);
    }
}
