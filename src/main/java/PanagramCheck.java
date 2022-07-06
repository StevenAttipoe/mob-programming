import java.util.HashSet;

public class PanagramCheck {
    public static boolean isPanagram(String sentence) {

        HashSet<Character> letters = new HashSet<>();

        for (char letter: sentence.toCharArray()) {
            if (Character.isAlphabetic(letter)) {
                letters.add(Character.toLowerCase(letter));
            }

        }

        return letters.size() == 26;

    }
}
