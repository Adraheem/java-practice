package turtleGraphics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TurtleDriver {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {

            System.out.println("""
                    Welcome to the Turtle Graphics Board
                    1 -> Start app
                    2 -> See commands (Help)
                                    
                    0 -> Quit app
                    """);
            String choice = input.next();
            if (choice.equals("0")){
                break;
            }
            switch (choice) {
                case "1" -> runBoard();
                case "2" -> {
                    System.out.printf("""
                            Turtle Graphics Commands
                            
                            %-7s %-30s
                            %-7s %-30s
                            %-7s %-30s
                            %-7s %-30s
                            %-7s %-30s
                            %-7s %-30s
                            %-7s %-30s
                            
                            
                            
                            """,
                            "1", "Pen up",
                            "2", "Pen down",
                            "3", "Turn right",
                            "4", "Turn left",
                            "5,10", "Move forward 10 spaces (replace 10 for a different number of spaces)",
                            "6", "Display board",
                            "9", "End of data");
                }
            }
        }
    }

    private static void runBoard(){
        Turtle turtle = new Turtle();
        List<String> entries = new ArrayList<>();

        System.out.println("Enter your commands:");
        String entry = "";
        while(!entry.equals("9")){
            entry = input.next();
            entries.add(entry);
        }

        for (String value : entries) {
            if (value.equals("1")) {
                turtle.penUp();
            } else if (value.equals("2")) {
                turtle.penDown();
            } else if (value.equals("3")) {
                turtle.turnRight();
            } else if (value.equals("4")) {
                turtle.turnLeft();
            } else if (value.contains("5,")) {
                int steps = Integer.parseInt(value.split(",")[1].trim());
                turtle.move(steps);
            } else if (value.equals("6")) {
                System.out.println();
                System.out.println(turtle.displayBoard());
            } else if (value.equals("9")) {
                break;
            }
        }

        System.out.println("\n\n\n");
    }
}
