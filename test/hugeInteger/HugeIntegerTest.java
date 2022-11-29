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
    void numberCanBeNegativeTest() {
        HugeInteger num1 = new HugeInteger(-500);

        assertEquals("-500", num1.toString());
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

    @Test
    void canSubtractOneNumberFromAnotherNumberTest() {
        HugeInteger num1 = HugeInteger.parse(78532);
        HugeInteger num2 = HugeInteger.parse("45265");

        assertEquals(HugeInteger.parse("33267"), num1.subtract(num2));
    }

    @Test
    void canSubtractNumberToGiveNegativeValueTest() {
        HugeInteger num1 = new HugeInteger("43");
        HugeInteger num2 = new HugeInteger("72");

        assertEquals(HugeInteger.parse("-29"), num1.subtract(num2));
    }

    @Test
    void numberIsGreaterTest() {
        HugeInteger num1 = new HugeInteger("993");
        HugeInteger num2 = new HugeInteger("72");

        assertTrue(num1.isGreaterThan(num2));
    }

    @Test
    void numberIsGreaterThanOrEqualToTest() {
        HugeInteger num1 = new HugeInteger("72");
        HugeInteger num2 = new HugeInteger("72");

        assertTrue(num1.isGreaterThanOrEqualTo(num2));
    }

    @Test
    void numberIsEqualToTest() {
        HugeInteger num1 = new HugeInteger("67");
        HugeInteger num2 = new HugeInteger("67");

        assertTrue(num1.isEqualTo(num2));
    }

    @Test
    void numberIsLesserThanTest() {
        HugeInteger num1 = new HugeInteger("43");
        HugeInteger num2 = new HugeInteger("72");

        assertTrue(num1.isLesserThan(num2));
    }

    @Test
    void numberIsLesserThanOrEqualToTest() {
        HugeInteger num1 = new HugeInteger("43");
        HugeInteger num2 = new HugeInteger("72");

        assertTrue(num1.isLesserThanOrEqualTo(num2));
    }

    @Test
    void hugeIntegerCanBeZeroTest() {
        HugeInteger num1 = HugeInteger.parse(0);
        HugeInteger num2 = new HugeInteger("00000");

        assertEquals("0", num1.toString());
        assertEquals("0", num2.toString());
        assertEquals("0", HugeInteger.ZERO.toString());
    }
}
