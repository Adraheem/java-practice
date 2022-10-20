package tdd;

public class ArrayUtils {

    public static String capitalize(String userInput) {
        String firstLetter = String.valueOf(userInput.charAt(0));
        return firstLetter.toUpperCase() + userInput.substring(1).toLowerCase();
    }
}
