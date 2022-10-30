package tdd.arrayAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAssignmentTest {

    private ArrayAssignment arrayAssignment;

    @BeforeEach
    void setUp() {
        arrayAssignment = new ArrayAssignment();
    }

    @Test
    void largestElementInArrayTest(){
        int[] numbers = {5,3,8,2,9,25,7,18};
        assertEquals(25, arrayAssignment.largestElementInArray(numbers));
    }

    @Test
    void reverseArrayTest(){
        int[] original = {5,3,2,6,8,1,5,2,9,2};
        int[] reversed = {2,9,2,5,1,8,6,2,3,5};
        assertArrayEquals(reversed, arrayAssignment.reverseArray(original));
    }

    @Test
    void ElementIsInArrayTest(){
        int[] numbers = {4,2,4,1,8,9,7,23};
        assertTrue(arrayAssignment.isInArray(numbers, 23));
    }

    @Test
    void elementsInOddPositionTest(){
        int[] original = {5,3,2,6,8,1,5,2,9,2};
        int[] oddPositions = {5,2,8,5,9};
        assertArrayEquals(oddPositions, arrayAssignment.oddPositionElements(original));
    }

    @Test
    void elementsInEvenPositionTest(){
        int[] original = {5,3,2,6,8,1,5,2,9,2};
        int[] evenPositions = {3,6,1,2,2};
        assertArrayEquals(evenPositions, arrayAssignment.evenPositionElements(original));
    }

    @Test
    void sumElementsTest(){
        assertEquals(20, arrayAssignment.sumElements(new int[] {5,7,2,5,1}));
    }

    @Test
    void sumElementsWithWhileTest(){
        assertEquals(20, arrayAssignment.sumElementsWithWhile(new int[] {5,7,2,5,1}));
    }

    @Test
    void sumElementsWithDoWhileTest(){
        assertEquals(20, arrayAssignment.sumElementsWithDoWhile(new int[] {5,7,2,5,1}));
    }

    @Test
    void textIsPalindromeTest(){
        assertTrue(arrayAssignment.isPalindrome("madam I'm adam"));
    }

    @Test
    void textIsNotPalindromeTest(){
        assertFalse(arrayAssignment.isPalindrome("madam I'm not adam"));
    }

    @Test
    void concatenateTwoArraysAlternateTest(){
        assertArrayEquals(
                new Object[] {1, "a", 2, "b", 3, "c"},
                arrayAssignment.concatenateAlternate(new int[] {1,2,3}, new String[] {"a", "b", "c"})
        );
    }

    @Test
    void concatenateTwoArraysTest(){
        assertArrayEquals(
                new Object[] {1, 2, 3, "a", "b", "c"},
                arrayAssignment.concatenate(new int[] {1,2,3}, new String[] {"a", "b", "c"})
        );
    }

    @Test
    void splitDigitTest(){
        assertArrayEquals(new int[] {2,3,4,2}, arrayAssignment.splitDigits(2342));
    }
}
