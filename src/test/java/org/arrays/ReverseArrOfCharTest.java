package org.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrOfCharTest {
    @Test
    public void reverseArrayOfCharacters() {
        char[] arrayToReverse = {'c', 'a', 'r', 'o', 'l', 'i', 'n', 'a'};
        char[] reversed = ReverseArrOfChar.reverseArray(arrayToReverse);
        char[] expected = {'a', 'n', 'i', 'l', 'o', 'r', 'a', 'c'};
        assertArrayEquals(expected, reversed);
    }
}