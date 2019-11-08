import java.util.ArrayList;
import java.util.List;

/**
 * 字母大小写全排列
 */

 public class LetterCasePermutation0784{

    public static void main(String[] args) {
        letterCasePermutation("a1B2");
    }

    public static List<String> result = new ArrayList<>();

    public static List<String> letterCasePermutation(String S) {
        
        backtrack(S, 0, "");
        for (String str : result) {
            System.out.println(str);
        }
        return result;
    }

    private static void backtrack(String s, int start, String sb) {

        if (start >= s.length()) {
            System.out.println(sb.toString());
            return;
        }
        char ch = s.charAt(start);
        if (Character.isLowerCase(ch)) {
           backtrack(s, start+1, sb + ch);
           backtrack(s, start+1, sb + Character.toUpperCase(ch) );
        }else if (Character.isUpperCase(ch)) {
            backtrack(s, start+1, sb + ch);
           backtrack(s, start+1, sb + Character.toLowerCase(ch));
        }else {
            backtrack(s, start+1, sb + ch);
        }
    }
    
 }