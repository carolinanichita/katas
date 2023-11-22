package hash;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordAppearancesInTheTextTest {

    @Test
    public void assertEquals2Times() {
        String text = "I have two apples and I have also two baskets.";
        Map actualWordAppearanceList = WordAppearancesInTheText.wordAppearanceInTheText(text);
        HashMap<String, Integer> expectedWordAppearanceList = new HashMap<String, Integer>() {{
            put("baskets", 1);
            put("and", 1);
            put("have", 2);
            put("I", 2);
            put( "also", 1);
            put("two", 2);
            put("apples", 1);
        }};
        assertEquals(expectedWordAppearanceList, actualWordAppearanceList);
    }

}