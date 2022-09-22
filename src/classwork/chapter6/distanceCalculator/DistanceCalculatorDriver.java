package classwork.chapter6.distanceCalculator;

public class DistanceCalculatorDriver {
    public static void main(String[] args) {
        DistanceCalculator distanceCalculator = new DistanceCalculator();

        distanceCalculator.setPoints();

        System.out.println(distanceCalculator.getDistance());
    }
}
