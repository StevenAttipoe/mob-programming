import java.util.HashMap;
import java.util.HashSet;

public class PanagramCheck {
    public static boolean isPanagram(String sentence) {
        return checkPanagram(sentence) > -1;
    }

    public static int checkPanagram(String sentence){

        HashSet<Character> letters = new HashSet<>();
        boolean isDuplicate = false;

        for (char letter: sentence.toCharArray()) {
            if (Character.isAlphabetic(letter)) {
                if (!letters.add(Character.toLowerCase(letter))) {
                    isDuplicate = true;
                }
            }
        }

        if (letters.size() == 26) {
            return isDuplicate ? 1 : 0;
        }
        return -1;
    }
}
