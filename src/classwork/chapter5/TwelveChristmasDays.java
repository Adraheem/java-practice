package classwork.chapter5;

public class TwelveChristmasDays {
    public static void main(String[] args) {
        for (int day = 1; day <= 12; day++) {
            System.out.println(getDay(day));
            System.out.println(getLyrics(day));
        }
    }

    private static String getDay(int day){
        return "\nOn the " + switch (day){
            case 1 -> "first";
            case 2 -> "second";
            case 3 -> "third";
            case 4 -> "forth";
            case 5 -> "fifth";
            case 6 -> "sixth";
            case 7 -> "seventh";
            case 8 -> "eighth";
            case 9 -> "ninth";
            case 10 -> "tenth";
            case 11 -> "eleventh";
            case 12 -> "twelfth";
            default ->  "";
        } + " day of Christmas my true love sent to me";
    }

    private static String getLyrics(int day){
        String lyrics = "";

        switch(day){
            case 12:
                lyrics += "twelve drummers drumming\n";
            case 11:
                lyrics += "eleven pipers piping\n";
            case 10:
                lyrics += "ten lords a-leaping\n";
            case 9:
                lyrics += "nine ladies dancing\n";
            case 8:
                lyrics += "eight maids a-milking\n";
            case 7:
                lyrics += "seven swans a-swimming\n";
            case 6:
                lyrics += "six geese a-laying\n";
            case 5:
                lyrics += "five gold rings\n";
            case 4:
                lyrics += "four calling birds\n";
            case 3:
                lyrics += "Three French hens\n";
            case 2:
                lyrics += "Two turtle doves\n";
            case 1:
                lyrics += "And a partridge in a pear tree.";
        }

        return lyrics;
    }
}
