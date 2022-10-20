package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {
    @Test
    void capitalizeFirstLetterTest(){
        String input = "JERRY";
        String output = ArrayUtils.capitalize(input);
        assertEquals("Jerry", output);
    }
}