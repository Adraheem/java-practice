package practice.sevenSegmentDisplay;

public class SevenSegmentDisplay {

    private int[][] data = new int[5][4];

    public String display(String binary) {
        resetLeds();
        if (binary.length() != 8 || binary.replaceAll("(1)|(0)", "").length() != 0) {
            throw new IllegalArgumentException("Invalid command");
        }

        if (binary.charAt(7) == '1'){
            for (int i = 0; i <= 6; i++) {
                powerLed(i, binary.charAt(i));
            }
        }

        String result = "";
        for (int[] row : data) {
            for (int cell : row) {
                result += cell == 0 ? "   " : " # ";
            }
            result += "\n";
        }
        return result;
    }

    private void resetLeds(){
        data = new int[5][4];
    }

    private void powerLed(int position, char value) {
        if (value == '1') {
            switch (position) {
                case 0 -> { // a
                    data[0][0] = 1;
                    data[0][1] = 1;
                    data[0][2] = 1;
                    data[0][3] = 1;
                }
                case 1 -> { // b
                    data[0][3] = 1;
                    data[1][3] = 1;
                    data[2][3] = 1;
                }
                case 2 -> { // c
                    data[2][3] = 1;
                    data[3][3] = 1;
                    data[4][3] = 1;
                }
                case 3 -> { // d
                    data[4][0] = 1;
                    data[4][1] = 1;
                    data[4][2] = 1;
                    data[4][3] = 1;
                }
                case 4 -> { // e
                    data[2][0] = 1;
                    data[3][0] = 1;
                    data[4][0] = 1;
                }
                case 5 -> { // f
                    data[0][0] = 1;
                    data[1][0] = 1;
                    data[2][0] = 1;
                }
                case 6 -> { // g
                    data[2][0] = 1;
                    data[2][1] = 1;
                    data[2][2] = 1;
                    data[2][3] = 1;
                }
            }
        }
    }

    public String render(String digit){
        if (digit.length() != 1 || digit.replaceAll("\\d", "").length() != 0){
            throw new IllegalArgumentException("Invalid command");
        }

        return switch(digit){
            case "0" -> display("11111101");
            case "1" -> display("01100001");
            case "2" -> display("11011011");
            case "3" -> display("11110011");
            case "4" -> display("01100111");
            case "5" -> display("10110111");
            case "6" -> display("10111111");
            case "7" -> display("11100001");
            case "8" -> display("11111111");
            case "9" -> display("11110111");
            default -> display("00000000");
        };
    }
}
