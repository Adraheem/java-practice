package classwork.chapter4.taxCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {
    private Citizen mathias;
    private Citizen dewunmi;
    private Citizen deola;

    @BeforeEach
    void setUp() {
        mathias = new Citizen();
        mathias.setFirstName("Mathias");
        mathias.setLastName("Momodu");
        mathias.setEarnings(new BigDecimal(17000));

        dewunmi = new Citizen("Adewunmi", "Adegunwa");
        dewunmi.setEarnings(BigDecimal.valueOf(25000));

        deola = new Citizen("Adeola", "Adekunle", BigDecimal.valueOf(45000));
    }

    @Test
    void calculateTax(){
        BigDecimal mathiasTax = TaxCalculator.calculateTax(mathias);
        assertEquals(2550, mathiasTax.intValue());

        BigDecimal dewunmiTax = TaxCalculator.calculateTax(dewunmi);
        assertEquals(3750, dewunmiTax.intValue());
    }

    @Test
    void calculateExcessTax(){
        BigDecimal deolaTax = TaxCalculator.calculateTax(deola);
        assertEquals(7500, deolaTax.intValue());
    }
}
