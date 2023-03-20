import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private Set<String> text = new HashSet<>();
    public WordsChecker(String text) {
        Collections.addAll(this.text, text.split("\\P{IsAlphabetic}+"));
    }

    protected boolean hasWord(String word) {
        return text.contains(word);
    }
}
