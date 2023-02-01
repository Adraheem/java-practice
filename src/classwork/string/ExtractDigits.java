package classwork.string;

public class ExtractDigits {
    public static void main(String[] args) {
        String text = """
                1. We are paragons
                2. I am a winner 365 days a year
                3. Devil is a liar
                4. There are 7 days a week
                """;

        StringBuilder digitsWithinText = new StringBuilder();
        for (int counter = 0; counter < text.length() ; counter++) {
            char currentCharacter = text.charAt(counter);
            if (Character.isDigit(currentCharacter)){
                digitsWithinText.append(currentCharacter);
            }
        }

        System.out.println(digitsWithinText);
    }
}
