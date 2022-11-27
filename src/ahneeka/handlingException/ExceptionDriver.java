package ahneeka.handlingException;

public class ExceptionDriver {
    public static void main(String[] args) {
        try {
            int value = ExceptionMain.subtract(14, 16);
            System.out.println(value);
        } catch (FirstLessThanSecondNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
