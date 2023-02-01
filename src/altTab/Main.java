package altTab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] apps = {4,1,3,7,6,8,5,2,10,9};
        System.out.println(Arrays.toString(newArrangement(10, 7, apps)));
    }

    private static int[] newArrangement(int input1, int input2, int[] input3){
        int noOfTabs = input2 % input1;
        int[] newArr = Arrays.copyOf(input3, input1);
        int d = newArr[noOfTabs-1];
        newArr[noOfTabs-1] = -1;

        int[] finalArr = new int[input1];
        int counter = 0;
        int pValue = 0;
        finalArr[0] = d;
        while(counter < input1){
            if (newArr[counter] != -1){
                finalArr[pValue+1] = newArr[counter];
                pValue++;
            }
            counter++;
        }
        return finalArr;
    }
}
