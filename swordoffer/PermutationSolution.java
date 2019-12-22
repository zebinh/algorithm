/**
 * 剑指Offer，字符串的排列
 */

import java.util.ArrayList;
public class PermutationSolution {

    public static void main(String[] args) {
        String str = "abc";
        Permutation(str);
        for (String s : r) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> r = null;

    public static ArrayList<String> Permutation(String str) {

        r = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str);
        perm(sb, 0);
        return r;
    }

    public static void perm(StringBuilder sb, int start){

        if (start == sb.length() - 1) {
            r.add(sb.toString());
            return;
        }
        for (int i = start; i < sb.length(); i++) {
            if (start != i && sb.charAt(start) == sb.charAt(i)) {
                continue;
            }
            swap(sb, start, i);
            perm(sb, start+1);
            swap(sb, start, i);
        }

    }

    public static void swap(StringBuilder sb, int i, int j) {
        char ch = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, ch);
    }
}