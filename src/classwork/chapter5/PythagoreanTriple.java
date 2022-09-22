package classwork.chapter5;

public class PythagoreanTriple {
    private static final int limitingValue = 20;

    public static void main(String[] args) {
        System.out.printf("%5s%18s%20s%n", "Side1", "Side2", "Hypothenuse");
        for (int i = 1; i <= limitingValue; i++) {
            for (int j = 1; j <= limitingValue; j++) {
                for (int hyp = 1; hyp <= limitingValue; hyp++) {
                    if(Math.pow(hyp, 2) == Math.pow(i, 2) + Math.pow(j, 2)){
                        System.out.printf("%5d       %10d       %10d%n", i, j, hyp);
                    }
                }
            }
        }
    }
}
