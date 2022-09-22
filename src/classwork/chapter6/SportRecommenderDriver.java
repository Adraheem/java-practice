package classwork.chapter6;

import java.util.Scanner;

public class SportRecommenderDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current temperature in degree Celsius: ");
        int temperature = input.nextInt();

        SportRecommender recommender = new SportRecommender(temperature);
        System.out.println(recommender.recommend());
    }
}
