package classwork.chapter4.factorial;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialTest(){
        assertEquals(
                new BigDecimal("30414093201713378043612608166064768844377641568960512000000000000"),
                Factorial.findFactorial(50)
        );
    }
}
