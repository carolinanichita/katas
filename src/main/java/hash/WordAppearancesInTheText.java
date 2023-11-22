package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordAppearancesInTheText {
    public static Map<String, Integer> wordAppearanceInTheText(String text) {
        List<String> words = splitWords(text);
        Map<String, Integer> wordAppearanceList = new HashMap<>();

        for (String word: words) {
            if (wordAppearanceList.containsKey(word)) {
                wordAppearanceList.put(word, wordAppearanceList.get(word) + 1);
            } else {
                wordAppearanceList.put(word, 1);
            }
        }

        return wordAppearanceList;
    }

    public static List<String> splitWords(String text) {
        List<String> words = new ArrayList<>();
        int startIndexWord = 0;
        int lengthWord = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (Character.isLetter(character)) {
                if (lengthWord == 0) {
                    startIndexWord = i;
                }
                lengthWord++;
            } else {
                words.add(text.substring(startIndexWord, startIndexWord + lengthWord));
                lengthWord = 0;
            }
        }

        return words;
    }

    public static void main(String[] args) {
        String text = "I have two apples and I have also two baskets.";

        System.out.println(wordAppearanceInTheText(text));
    }
}
