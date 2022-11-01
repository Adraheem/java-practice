package tdd.arrayAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapArrayTest {

    @Test
    void swapArrayElementsTest(){
        assertArrayEquals(new int[] {3,6}, SwapArray.swap(new int[] {6,3}));
    }
}
