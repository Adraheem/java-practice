package classwork.chapter2;

public class ArithSmallestLargest {
    private int num1;
    private int num2;
    private int num3;

    public ArithSmallestLargest(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getSum() {
        return num1 + num2 + num3;
    }

    public int getAverage() {
        return (num1 + num2 + num3) / 3;
    }

    public int getProduct() {
        return num1 * num2 * num3;
    }

    public int getSmallest() {
        int smallestNumber = num1;

        if(num2 < smallestNumber){
            smallestNumber = num2;
        }

        if(num3 < smallestNumber){
            smallestNumber = num3;
        }

        return smallestNumber;
    }

    public int getLargest() {
        int largestNumber = num1;

        if(num2 > largestNumber){
            largestNumber = num2;
        }

        if(num3 > largestNumber){
            largestNumber = num3;
        }

        return largestNumber;
    }
}
