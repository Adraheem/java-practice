package classwork.chapter2;

public class ComparingIntegers {

    private final int num;
    private final int comparison = 100;

    public ComparingIntegers(int num) {
        this.num = num;
    }

    public boolean isNumberGreaterThan100() {
        return num > comparison;
    }

    public boolean isEqualTo100() {
        return num == comparison;
    }

    public boolean isNumberSquareGreaterThan100() {
        return Math.pow(num, 2) > comparison;
    }

    public boolean isSquareEqualTo100() {
        return Math.pow(num, 2) == comparison;
    }
}
