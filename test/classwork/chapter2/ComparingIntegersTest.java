package classwork.chapter2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ComparingIntegersTest {
    private static ComparingIntegers number;

    @BeforeAll
    static void setUp() {
        number = new ComparingIntegers(10);
    }

    @AfterAll
    static void tearDown() {
        number = null;
    }

    @Test
    void testNotNull(){
        assertNotNull(number);
    }

    @Test
    void numberGreaterThan100Test(){
        assertFalse(number.isNumberGreaterThan100());
    }

    @Test
    void numberLesserThan100Test(){
        assertFalse(number.isNumberGreaterThan100());
    }

    @Test
    void numberEqualTo100Test(){
        assertFalse(number.isEqualTo100());
    }

    @Test
    void numberNotEqualTo100(){
        assertFalse(number.isEqualTo100());
    }

    @Test
    void squareGreaterThan100Test(){
        assertFalse(number.isNumberSquareGreaterThan100());
    }

    @Test
    void squareLesserThan100Test(){
        assertFalse(number.isNumberSquareGreaterThan100());
    }

    @Test
    void squareEqualTo100Test(){
        assertTrue(number.isSquareEqualTo100());
    }

    @Test
    void squareNotEqualTo100(){
        assertTrue(number.isSquareEqualTo100());
    }
}