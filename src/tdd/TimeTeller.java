package tdd;

public class TimeTeller {
    public static String speakTime(String time){
        String[] timeArray = time.trim().split(":");

        if(timeArray.length != 2
                || Integer.parseInt(timeArray[0]) >= 24
                || Integer.parseInt(timeArray[0]) < 0
                || Integer.parseInt(timeArray[1]) >= 60
                || Integer.parseInt(timeArray[1]) < 0){
            throw new IllegalArgumentException("Invalid time format");
        }

        int hour = Integer.parseInt(timeArray[0]) % 12;
        int minute = Integer.parseInt(timeArray[1]);

        String hh = parseToText(hour);
        String mm = parseToText(minute);

        if(minute == 0) {
            return hh + " o'clock";
        }
        else if (minute < 30){
            return mm + " minutes after " + hh;
        }
        else if (minute == 30){
            return "half past " + hh;
        }
        else {
            int rem = 60 - minute;
            return parseToText(rem) + " minutes to " + parseToText(hour + 1);
        }
    }

    private static String parseToText(int number){
        String text;
        if(number == 0){
            text = parseTens(12);
        }
        else if(number < 10){
            text = parseUnit(number);
        } else if(number < 20) {
            text = parseTens(number);
        } else {
            text = parseTens(number) + ((number % 10 > 0) ? "-" + parseUnit(number % 10) : "");
        }

        return text;
    }

    private static String parseUnit(int number){
        return switch(number){
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "";
        };
    }
    private static String parseTens(int number){
        int tens = number / 10;

        return switch(tens){
            case 1 -> switch (number){
                    case 10 -> "ten";
                    case 11 -> "eleven";
                    case 12 -> "twelve";
                    case 13 -> "thirteen";
                    case 14 -> "fourteen";
                    case 15 -> "fifteen";
                    case 16 -> "sixteen";
                    case 17 -> "seventeen";
                    case 18 -> "eighteen";
                    case 19 -> "nineteen";
                    default -> "";
                };
            case 2 -> "twenty";
            case 3 -> "thirty";
            case 5 -> "fifty";
            default -> parseToText(tens)+"ty";
        };
    }
}
