package classwork.chapter7;

public class ArraySum {

    public static int addNumbers(int[] numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        return sum;
    }
}
