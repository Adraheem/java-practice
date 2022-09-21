package classwork.chapter6;

public class AddNumbers {
    private double addNumbers(int num1, int num2){
        return num1 + num2;
    }
    private double addNumbers(int num1, double num2){
        return num1 + num2;
    }
    private double addNumbers(double num1, double num2){
        return num1 + num2;
    }
    private double addNumbers(double num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        AddNumbers num = new AddNumbers();

        System.out.println("2 + 2 = " + num.addNumbers(2, 2));
        System.out.println("2 + 2.02 = " + num.addNumbers(2, 2.02));
        System.out.println("2.02 + 2.02 = " + num.addNumbers(2.02, 2.02));
        System.out.println("2.02 + 2 = " + num.addNumbers(2.02, 2));
    }
}
