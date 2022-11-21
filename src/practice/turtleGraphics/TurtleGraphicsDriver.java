package practice.turtleGraphics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TurtleGraphicsDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TurtleGraphics turtle = new TurtleGraphics();
        List<String> entries = new ArrayList<>();

        String value = "";

        System.out.println("Enter commands: ");

        while(!value.equals("9")){
            value = input.next();
            entries.add(value);
        }

        for(String entry : entries){
            if (entry.equals("1")){
                turtle.penUp();
            }
            else if (entry.equals("2")){
                turtle.penDown();
            }
            else if (entry.equals("3")){
                turtle.turnRight();
            }
            else if (entry.equals("4")){
                turtle.turnLeft();
            }
            else if (entry.contains("5,")){
                String[] entryArray = entry.split(",");
                String moveBy = entryArray[1].trim();
                int moveByValue = Integer.parseInt(moveBy);

                turtle.move(moveByValue);
            }
            else if (entry.equals("6")){
                System.out.println(turtle.displaySketchPad());
            }
            else if (entry.equals("9")){
                break;
            }
        }
    }
}
