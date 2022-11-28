package hugeInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {
    @Test
    void canCreateHugeIntegerTest() {
        HugeInteger num1 = new HugeInteger("12345678");
        assertEquals("12345678", num1.toString());
    }

    @Test
    void canCreateHugeIntegerWithZerosTest() {
        HugeInteger num1 = new HugeInteger("00000045");
        assertEquals("45", num1.toString());
    }

    @Test
    void canCreateHugeIntegerWithSpecialCharactersTest() {
        HugeInteger num1 = new HugeInteger("12_345_678_910");
        assertEquals("12345678910", num1.toString());
    }

    @Test
    void canCreateHugeIntegerWithStaticMethodTest() {
        HugeInteger num1 = HugeInteger.valueOf("12345");
        assertEquals("12345", num1.toString());
    }

    @Test
    void canAddTwoHugeIntegersTest() {
        HugeInteger num1 = HugeInteger.valueOf("4943");
        HugeInteger num2 = HugeInteger.valueOf("3521");

        assertEquals(HugeInteger.valueOf("8464"), num1.add(num2));
    }

    @Test
    void canAddTwoHugeIntegersOfDifferentLengthsTest() {
        HugeInteger num1 = HugeInteger.valueOf("494367853");
        HugeInteger num2 = HugeInteger.valueOf("352166");

        assertEquals(HugeInteger.valueOf("494720019"), num1.add(num2));
    }
}
