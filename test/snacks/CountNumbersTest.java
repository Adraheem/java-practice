package snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNumbersTest {

    @Test
    void countOnlyNumbersTest(){
        assertEquals(6, CountNumbers.count("&5%#3786cfdsw!4$"));
    }
}