package classwork.chapter6;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 10000; i++) {
            if(isPrime(i)){
                count++;
                System.out.printf("%10d", i);

                if(count%8==0){
                    System.out.println();
                }
            }
        }
    }

    private static boolean isPrime(int number){
        boolean value = true;
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                value = false;
                break;
            }
        }

        return value;
    }
}
