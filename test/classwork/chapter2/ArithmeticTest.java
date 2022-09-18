package classwork.chapter2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    private static Arithmetic arithmetic;

    @BeforeAll
    static void setUp() {
        arithmetic = new Arithmetic(6, 10);
    }

    @Test
    void checkNotNull(){
        assertNotNull(arithmetic);
    }

    @Test
    void squareOfEach(){
        assertEquals(36, arithmetic.getSquare(1));
        assertEquals(100, arithmetic.getSquare(2));
    }

    @Test
    void sumOfSquaresTest(){
        assertEquals(136, arithmetic.getSumOfSquares());
    }

    @Test
    void differenceOfSquaresTest(){
        assertEquals(-64, arithmetic.getDifferenceOfSquares());
    }
}
