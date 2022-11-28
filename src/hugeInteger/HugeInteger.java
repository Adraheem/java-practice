package hugeInteger;

import java.util.Arrays;

public class HugeInteger {
    private final int MAX_LIMIT = 40;
    private int[] digits = new int[MAX_LIMIT];
    public final int length;

    public HugeInteger(String number) {
        String[] digitString = this.trimZeros(number.replaceAll("\\D", "")).split("");
        length = digitString.length;

        int i = MAX_LIMIT - digitString.length + 1;
        int numCounter = 0;

        while ( i <= MAX_LIMIT){
            digits[i - 1] = Integer.parseInt(digitString[numCounter]);

            i++;
            numCounter++;
        }
    }

    public HugeInteger(int number){
        this(String.valueOf(number));
    }

    private String trimZeros(String string){
        String value = string;

        for (int i = 0; i < string.length(); i++){
            if(value.charAt(0) == '0'){
                value = value.substring(1);
            } else {
                break;
            }
        }

        return value;
    }

    public static HugeInteger valueOf(String number){
        return new HugeInteger(number);
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();

        for (int i = (MAX_LIMIT - length + 1); i <= MAX_LIMIT; i++) {
            value.append(digits[i - 1]);
        }

        return value.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) return false;

        HugeInteger num2 = (HugeInteger) obj;
        return Arrays.equals(this.digits, num2.digits);
    }

    public HugeInteger add(HugeInteger num2) {
        int remainder = 0;
        int counter = MAX_LIMIT - 1;

        StringBuilder sumString = new StringBuilder();

        while(counter >= Math.min((MAX_LIMIT - this.length), (MAX_LIMIT - num2.length)) || remainder != 0){
            int d1 = this.digits[counter];
            int d2 = num2.digits[counter];

            int sum = d1 + d2 + remainder;
            int sumD = sum % 10 ;
            remainder = sum / 10;
            sumString.insert(0, sumD);
            counter--;
        }

        return new HugeInteger(sumString.toString());
    }
}
