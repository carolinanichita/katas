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

}