package hash;

import java.util.HashSet;
import java.util.Set;

public class IsPermutationAPalindrome {

//    O(n) time complexity, O(1) space complexity
    public static Boolean isPermutationAPalindrome(String word) {
        Set<Character> oddCharacters = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);

            if (oddCharacters.contains(character)) {
                oddCharacters.remove(character);
            } else {
                oddCharacters.add(character);
            }
        }
        return oddCharacters.size() <= 1;
    }
}
