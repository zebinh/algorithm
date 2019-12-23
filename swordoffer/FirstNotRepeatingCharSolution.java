import java.util.HashMap;
import java.util.Map;

/**
 * 剑指Offer，第一个只出现一次的字符
 */

public class FirstNotRepeatingCharSolution {

    public static void main(String[] args) {
        String str = "google";
        System.out.println(FirstNotRepeatingChar(str));
    }

    public static int FirstNotRepeatingChar(String str) {
        
        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (m.get(c) == null) {
                m.put(c, 1);
            }else{
                m.put(c, m.get(c)+1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (m.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}