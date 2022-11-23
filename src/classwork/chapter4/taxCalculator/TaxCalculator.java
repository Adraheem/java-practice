package classwork.chapter4.taxCalculator;

import java.math.BigDecimal;

public class TaxCalculator {
    private static final BigDecimal MINIMUM_EARNING = BigDecimal.valueOf(30000);
    private static final double BASE_TAX_RATE = 0.15;
    private static final double ADDITIONAL_TAX_RATE = 0.20;

    public static BigDecimal calculateTax(Citizen citizen){
        return calculateTax(citizen.getEarnings().doubleValue());
    }

    public static BigDecimal calculateTax(double earning){
        double taxAmount;

        if (earning <= MINIMUM_EARNING.doubleValue()) {
            taxAmount = earning * BASE_TAX_RATE;
        } else {
            taxAmount = MINIMUM_EARNING.doubleValue() * BASE_TAX_RATE;

            double additionalEarning = earning - MINIMUM_EARNING.doubleValue();
            taxAmount += (additionalEarning * ADDITIONAL_TAX_RATE);
        }

        return BigDecimal.valueOf(taxAmount);
    }
}
