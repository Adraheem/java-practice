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
        HugeInteger num1 = HugeInteger.parse("12345");
        assertEquals("12345", num1.toString());
    }

    @Test
    void canAddTwoHugeIntegersTest() {
        HugeInteger num1 = HugeInteger.parse("4943");
        HugeInteger num2 = HugeInteger.parse("3521");

        assertEquals(HugeInteger.parse("8464"), num1.add(num2));
    }

    @Test
    void canAddTwoHugeIntegersOfDifferentLengthsTest() {
        HugeInteger num1 = HugeInteger.parse("494367853");
        HugeInteger num2 = HugeInteger.parse("352166");

        assertEquals(HugeInteger.parse("494720019"), num1.add(num2));
    }
}
