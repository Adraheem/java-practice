package ahneeka.handlingException;

public class ExceptionMain {
    public static int subtract(int a, int b) {
        if (a < b) throw new FirstLessThanSecondNumberException("A cannot be less than B");

        int value = a - b;
        return value;
    }
}
