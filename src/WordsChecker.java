import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    String text;
    Set<String> hashText = new HashSet<>();
    public WordsChecker(String text) {
        this.text = text;
    }

    protected boolean hasWord(String word) {
        Collections.addAll(this.hashText, text.split("\\P{IsAlphabetic}+"));
        return text.contains(word);
    }

}
