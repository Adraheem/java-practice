package classwork.chapter7;

import java.security.SecureRandom;

public class DiceRolling {
    private static final SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) {
        int[] frequency = new int[12];

        for (int i = 0; i < 36_000_000; i++) {
            ++frequency[rollDie() - 1];
        }

        for(int i = 0; i < 12; i++){
            int freq = frequency[i];
            System.out.printf("%-3d: %-10s %-5s%n", i+1, "("+freq+")", "*".repeat(freq/250_000));
        }
    }

    private static int rollDie(){
        int num1 = 1 + secureRandom.nextInt(6);
        int num2 = 1 + secureRandom.nextInt(6);

        return num1 + num2;
    }
}
