package classwork.chapter2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ArithSmallestLargestTest {
    private static ArithSmallestLargest arithmetic;

    @BeforeAll
    static void setup(){
        arithmetic = new ArithSmallestLargest(40, 20, 30);
    }

    @AfterAll
    static void clearUp(){
        arithmetic = null;
    }

    @Test
    void testNotNull(){
        assertNotNull(arithmetic);
    }

    @Test
    void sumNumbersTest(){
        assertEquals(90, arithmetic.getSum());
    }

    @Test
    void averageNumbersTest(){
        assertEquals(30, arithmetic.getAverage());
    }

    @Test
    void productOfNumbersTest(){
        assertEquals(24000, arithmetic.getProduct());
    }

    @Test
    void smallestNumberTest(){
        assertEquals(20, arithmetic.getSmallest());
    }

    @Test
    void largestNumberTest(){
        assertEquals(40, arithmetic.getLargest());
    }
}
