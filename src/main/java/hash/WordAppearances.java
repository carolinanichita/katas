package hash;

import java.util.HashMap;
import java.util.Map;

public class WordAppearances {
    private final Map<String, Integer> wordsCountList = new HashMap<>();
    public WordAppearances(String text) {
        wordAppearanceInTheText(text);
    }

    public Map<String, Integer> getWordsCounts() {
        return wordsCountList;
    }

    private void wordAppearanceInTheText(String text) {
        int currentWordStartIndex = 0;
        int currentWordLength = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (i == text.length() - 1) {
                if (Character.isLetter(character)) {
                    currentWordLength ++;
                }
                if (currentWordLength > 0) {
                    String currentWord = text.substring(currentWordStartIndex, currentWordStartIndex + currentWordLength);
                    addWordToTheList(currentWord);
                }
            } else if (character == ' ' || character == '\u2014') {
                if (currentWordLength > 0) {
                    String currentWord = text.substring(currentWordStartIndex, currentWordStartIndex + currentWordLength);
                    addWordToTheList(currentWord);
                    currentWordLength = 0;
                }
            } else if (character == '.') {
                if (i < text.length() - 1 && text.charAt(i) == '.') {
                    if (currentWordLength > 0) {
                        String currentWord = text.substring(currentWordStartIndex, currentWordStartIndex + currentWordLength);
                        addWordToTheList(currentWord);
                        currentWordLength = 0;
                    }
                }
            } else if (Character.isLetter(character) || character == '\'') {
                if (currentWordLength == 0) {
                    currentWordStartIndex = i;
                }
                currentWordLength ++;
            } else if (character == '-') {
                if (i > 0 && Character.isLetter(text.charAt(i - 1)) && Character.isLetter(text.charAt(i+1))) {
                    currentWordLength ++;
                } else if (currentWordLength > 0) {
                    String currentWord = text.substring(currentWordStartIndex, currentWordStartIndex + currentWordLength);
                    addWordToTheList(currentWord);
                    currentWordLength = 0;
                }
            }
        }
    }

    private void addWordToTheList(String word) {
        if (wordsCountList.containsKey(word)) {
            wordsCountList.put(word, wordsCountList.get(word) + 1);

        } else if (wordsCountList.containsKey(word.toLowerCase())) {
            int newCount = wordsCountList.get(word.toLowerCase() +1);
            wordsCountList.put(word.toLowerCase(), newCount);
        } else if (wordsCountList.containsKey(capitalizeWord(word))) {
            int newCount = wordsCountList.get(capitalizeWord(word) + 1);
            wordsCountList.put(word, newCount);
            wordsCountList.remove(capitalizeWord(word));
        } else {
            wordsCountList.put(word, 1);
        }
    }

    private String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}