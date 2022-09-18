package classwork.chapter2;

public class Arithmetic {

    private int num1;
    private int num2;
    private int num1Sqr;
    private int num2Sqr;

    public Arithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        calculateSquares();
    }

    public int getSquare(int num) {
        return num == 1 ? num1Sqr : num2Sqr;
    }

    private void calculateSquares(){
        this.num1Sqr = num1 * num1;
        this.num2Sqr = num2 * num2;
    }

    public int getSumOfSquares() {
        return this.num1Sqr + this.num2Sqr;
    }

    public int getDifferenceOfSquares() {
        return this.num1Sqr - this.num2Sqr;
    }
}
