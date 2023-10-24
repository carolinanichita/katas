package org.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {
    @Test
    public void shouldReverseAmazingSeason() {
        char[] message = { 'a', 'a', 'a', 'a', ' ',
                'b', 'b', 'b', 'b', 'b', ' ',
                'c', 'c', 'c', 'c', 'c' };
        char[] actual = ReverseWords.reverseWords(message);
        char[] expected = {'c', 'c', 'c', 'c', 'c', ' ',
                           'b', 'b', 'b', 'b', 'b', ' ',
                           'a', 'a', 'a', 'a',};
        assertArrayEquals(expected, actual);
    }

}