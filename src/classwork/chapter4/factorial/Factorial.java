package classwork.chapter4.factorial;

import java.math.BigDecimal;

public class Factorial {

    public static BigDecimal findFactorial(int number) {
        BigDecimal product = new BigDecimal(1);
        for (int i = 1; i <= number; i++) {
            product = product.multiply(new BigDecimal(i));
        }

        return product;
    }
}
