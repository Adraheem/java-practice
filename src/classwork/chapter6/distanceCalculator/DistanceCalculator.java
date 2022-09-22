package classwork.chapter6.distanceCalculator;

import java.util.Scanner;

public class DistanceCalculator {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private final Scanner input = new Scanner(System.in);

    public void setPoints(){
        System.out.println("Enter point 1 (x1, y1): ");
        String[] point1 = input.nextLine().split(",");
        x1 = Double.parseDouble(point1[0].trim());
        y1 = Double.parseDouble(point1[1].trim());

        System.out.println("Enter point 1 (x2, y2): ");
        String[] point2 = input.nextLine().split(",");
        x2 = Double.parseDouble(point2[0].trim());
        y2 = Double.parseDouble(point2[1].trim());
    }

    public double getDistance(){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}
