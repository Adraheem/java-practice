package classwork.chapter7;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//
//        numbers[0] = 3;
//        numbers[1] = 5;
//        numbers[2] = 3;
//        numbers[3] = 7;
//        numbers[4] = 26;
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        String[] colours = new String[7];
        colours[0] = "Red";
        colours[1] = "Orange";
        colours[2] = "Yellow";
        colours[3] = "Green";
        colours[4] = "Blue";
        colours[5] = "Indigo";
        colours[6] = "Violet";

        for (String colour : colours) {
            System.out.println(colour);
        }
    }
}
