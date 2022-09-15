package classwork.chapter5;

public class PythagoreanTriple {
    public static void main(String[] args) {
        System.out.printf("%5s%10s%10s%n", "Side1", "Side2", "Hypothenuse");
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                for (int hyp = 1; hyp <= 500; hyp++) {
                    if(Math.pow(hyp, 2) == Math.pow(i, 2) + Math.pow(j, 2)){
                        System.out.printf("%5d       %10d       %10d%n", i, j, hyp);
                    }
                }
            }
        }
    }
}
