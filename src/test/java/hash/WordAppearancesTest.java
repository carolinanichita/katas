package hash;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordAppearancesTest {
    @Test
    public void simpleSentenceTest() {
        final String text = "I have two amazing kids!";
        final Map<String, Integer> expected = new HashMap<String, Integer>() {{
            put("I", 1);
            put("have", 1);
            put("two", 1);
            put("amazing", 1);
            put("kids", 1);
        }};

        final WordAppearances actual = new WordAppearances(text);
        assertEquals(expected, actual.getWordsCounts());
    }

    @Test
    public void hyphenatedWordSentenceTest() {
        final String text = "Dessert - home-made Tiramisu.";
        final Map<String, Integer> expected = new HashMap<String, Integer>() {{
            put("Dessert", 1);
            put("home-made", 1);
            put("Tiramisu", 1);
        }};

        final WordAppearances actual = new WordAppearances(text);
        assertEquals(expected, actual.getWordsCounts());
    }

    @Test
    public void punctuationTest() {
        final String text = "Is it cake? Yep! Yummy!";
        final Map<String, Integer> expected = new HashMap<String, Integer>() {{
            put("Is", 1);
            put("it", 1);
            put("cake", 1);
            put("Yep", 1);
            put("Yummy", 1);
        }};

        final WordAppearances actual = new WordAppearances(text);
        assertEquals(expected, actual.getWordsCounts());
    }

    @Test
    public void ellipsesBetweenWordsTest() {
        final String text = "good...good... thinking about the next one...";
        final Map<String, Integer> expected = new HashMap<String, Integer>() {{
            put("good", 2);
            put("thinking", 1);
            put("about", 1);
            put("the", 1);
            put("next", 1);
            put("one", 1);
        }};

        final WordAppearances actual = new WordAppearances(text);
        assertEquals(expected, actual.getWordsCounts());
    }

    @Test
    public void apostrophesTest() {
        final String text = "Eugenia's bakery: Sofia's cakes ";
        final Map<String, Integer> expected = new HashMap<String, Integer>() {{
            put("Eugenia's", 1);
            put("bakery", 1);
            put("Sofia's", 1);
            put("cakes", 1);
        }};

        final WordAppearances actual = new WordAppearances(text);
        assertEquals(expected, actual.getWordsCounts());
    }
}