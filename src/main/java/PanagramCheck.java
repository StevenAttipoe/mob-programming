import java.util.HashMap;
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

    public static int checkPanagram(String sentence){

        HashSet<Character> letters = new HashSet<>();
        boolean flag = false;

        for (char letter: sentence.toCharArray()) {
            if (Character.isAlphabetic(letter)) {
                if (letters.contains(Character.toLowerCase(letter))) {
                    flag = true;
                }
                letters.add(Character.toLowerCase(letter));
            }
        }

        if (letters.size() == 26 && flag) {
            return 1;
        }
        else if (letters.size() == 26 ) {
            return 0;
        }
        else{
            return -1;
        }
    }
}
