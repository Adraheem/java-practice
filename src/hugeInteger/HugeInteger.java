package hugeInteger;

import java.util.Arrays;

public class HugeInteger implements Comparable<HugeInteger> {
    private final int MAX_LIMIT = 40;
    private final int[] digits = new int[MAX_LIMIT];
    private final boolean isNegative;
    public final int length;
    public static HugeInteger ZERO = HugeInteger.parse("0");

//    CONSTRUCTORS *************************************************************************

    public HugeInteger(String number) {
        this.isNegative = number.contains("-");
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

//    FACTORY METHODS *************************************************************************

    public static HugeInteger parse(String number){
        return new HugeInteger(number);
    }

    public static HugeInteger parse(int number){
        return new HugeInteger(number);
    }

//    OVERRIDDEN METHODS *************************************************************************

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();

        if (this.isNegative){
            value.append("-");
        }

        for (int i = (MAX_LIMIT - length + 1); i <= MAX_LIMIT; i++) {
            value.append(digits[i - 1]);
        }

        return value.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) return false;

        HugeInteger num2 = (HugeInteger) obj;
        return Arrays.equals(this.digits, num2.digits) && this.isNegative == num2.isNegative;
    }

    @Override
    public int compareTo(HugeInteger num2){
        if (this.equals(num2)) return 0;

        int remainder = 0;
        int counter = MAX_LIMIT - 1;


        while (counter > Math.min((MAX_LIMIT - this.length), (MAX_LIMIT - num2.length)) - 1 ){
            int d1 = this.digits[counter];
            int d2 = num2.digits[counter];

            int sub = d1 - remainder - d2;
            remainder = sub < 0 ? 1 : 0;

            counter--;
        }

        if (remainder == 1){
            return -1;
        } else {
            return 1;
        }
    }

//    PRIVATE METHODS *************************************************************************

    private String trimZeros(String string){
        String value = string;

        for (int i = 0; i < string.length() - 1; i++){
            if(value.charAt(0) == '0'){
                value = value.substring(1);
            } else {
                break;
            }
        }

        return value;
    }

    private HugeInteger privateSubtract(HugeInteger num2, boolean isNegative) {
        int remainder = 0;
        int counter = MAX_LIMIT - 1;

        StringBuilder minusString = new StringBuilder();

        while (counter > 0 ){
            int d1 = this.digits[counter];
            int d2 = num2.digits[counter];

            int sub = d1 - remainder - d2;
            remainder = sub < 0 ? 1 : 0;

            minusString.insert(0, (sub < 0 ? (10 + sub) : sub));
            counter--;
        }

        return new HugeInteger((isNegative ? "-" : "") + minusString);
    }

//    PUBLIC METHODS *************************************************************************

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

    public HugeInteger subtract(HugeInteger num2) {
        if (this.compareTo(num2) < 0){
            return num2.privateSubtract(this, true);
        }

        return this.privateSubtract(num2, false);
    }

    public boolean isGreaterThan(HugeInteger num2) {
        return this.compareTo(num2) > 0;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger num2) {
        return this.compareTo(num2) >= 0;
    }

    public boolean isEqualTo(HugeInteger num2) {
        return this.compareTo(num2) == 0;
    }

    public boolean isLesserThan(HugeInteger num2) {
        return this.compareTo(num2) < 0;
    }

    public boolean isLesserThanOrEqualTo(HugeInteger num2) {
        return this.compareTo(num2) <= 0;
    }
}
