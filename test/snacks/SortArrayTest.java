package snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {
    SortArray sortArray;

    @BeforeEach
    void setUp(){
        sortArray = new SortArray();
    }

    @Test
    void testSort() {
        int[] expected = new int[] {1,2,4,4,6,7,8,8};
        int[] sorted = sortArray.sortAscending(new int[] {6,8,2,4,1,7,4,8});
        assertArrayEquals(expected, sorted);
    }

    @Test
    void testSortDescending() {
        int[] expected = new int[] {8,8,7,6,4,4,2,1};
        int[] sorted = sortArray.sortDescending(new int[] {6,8,2,4,1,7,4,8});
        assertArrayEquals(expected, sorted);
    }

    @Test
    void shuffleArrayTest(){
        int[] original = {4,7,3,5,9,2,6,9};
        int[] shuffled = sortArray.shuffle(original);
        assertFalse(Arrays.equals(original, shuffled));
    }

    @Test
    void generateArrayTest(){
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sortArray.generateArray(10));
    }

    @Test
    void arrayToStringTest(){
        int[] original = {4,7,3,5,9,2,6,9};
        assertEquals("4,7,3,5,9,2,6,9", sortArray.arrayToString(original));
    }

    @Test
    void charArrayTest(){
        char[] original = {'X', 'O', 'X'};
        assertArrayEquals(original, sortArray.generateCharArray());
    }
}
