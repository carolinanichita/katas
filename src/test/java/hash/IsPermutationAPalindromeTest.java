package hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPermutationAPalindromeTest {

    @Test
    public void assertTrueMamamTest() {
        String word = "mamam";
        Boolean result = IsPermutationAPalindrome.isPermutationAPalindrome(word);
        assertTrue(result);
    }

    @Test
    public void assertFalseCarolinaTest() {
        String word = "carolina";
        Boolean result = IsPermutationAPalindrome.isPermutationAPalindrome(word);
        assertFalse(result);
    }

    @Test
    public void assertTrueEmptyStringTest() {
        String word = "";
        Boolean result = IsPermutationAPalindrome.isPermutationAPalindrome(word);
        assertTrue(result);
    }

    @Test
    public void assertTrueOneCharacterTest() {
        String word = "c";
        Boolean result = IsPermutationAPalindrome.isPermutationAPalindrome(word);
        assertTrue(result);
    }
}