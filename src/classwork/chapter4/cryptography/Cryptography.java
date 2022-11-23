package classwork.chapter4.cryptography;

public class Cryptography {
    public static String encrypt(String number){
        int numberLength = number.length();
        String[] digitsArray = number.split("");

        for (int i = 0; i < numberLength; i++) {
            int digit = Integer.parseInt(digitsArray[i]);

            digitsArray[i] = String.valueOf((digit + 7) % 10);
        }
        return digitsArray[2] + digitsArray[3] + digitsArray[0] + digitsArray[1];
    }

    public static String decrypt(String number){
        int numberLength = number.length();
        String[] digitsArray = number.split("");

        for (int i = 0; i < numberLength; i++) {
            int digit = Integer.parseInt(digitsArray[i]);
            int value;

            if (digit > 6){
                value = digit - 7;
            } else {
                value = digit + 10 - 7;
            }
            digitsArray[i] = String.valueOf(value);
        }

        return digitsArray[2] + digitsArray[3] + digitsArray[0] + digitsArray[1];
    }
}
