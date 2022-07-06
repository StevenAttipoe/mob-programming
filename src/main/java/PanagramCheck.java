import java.util.HashSet;

public class PanagramCheck {
    public static boolean panagramCheck(String panagram) {
        if(panagram.isEmpty() || panagram.length() < 26){
            return false;
        }

        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<panagram.length();i++){
            if(Character.isAlphabetic(panagram.charAt(i))){
                set.add(Character.toLowerCase(panagram.charAt(i)));
            }
        }

        return set.size() == 26;

    }
}
