public class Main {
    final static String SOURCE_TEXT =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                    "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                    "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                    "Excepteur sint occaecat cupidatat non proident, " +
                    "sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static String wordOne = "dolore";
    public static String wordTwo = "test";
    public static void main(String[] args) {
        WordsChecker wc = new WordsChecker(SOURCE_TEXT);
        System.out.println("Исходный текст содержит слово " + wordOne + ": " + wc.hasWord(wordOne));
        System.out.println("Исходный текст содержит слово " + wordTwo + ": " + wc.hasWord(wordTwo));
    }
}