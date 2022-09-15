package classwork;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        while(true){
            System.out.print("Enter trip miles: ");
            int miles = input.nextInt();

            System.out.print("Enter gallons used: ");
            int gallon = input.nextInt();

            double mpg = (double) miles / gallon;
            System.out.printf("The trip mile per gallon is %.2f%n", mpg);

            totalMiles += miles;
            totalGallons += gallon;

            input.nextLine();

            System.out.println("Do you want to add another trip?");
            String answer = input.nextLine();

            if (answer.trim().equalsIgnoreCase("yes")  || answer.trim().equalsIgnoreCase("y") || answer.trim().equals("1")){
                continue;
            } else {
                break;
            }
        }

        double avgMilesPerGallon = (double) totalMiles / totalGallons;
        System.out.printf("The combined miles per gallon is: %.2f miles/gallon%n", avgMilesPerGallon);
    }
}
