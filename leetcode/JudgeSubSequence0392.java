/**
 *  动态规划：判断子序列
 * 
 */

 public class JudgeSubSequence0392{

    public static void main(String[] args) {
        String s = "abc";
        String t = "";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {

        if (s == null || t == null ) {
            return false;
        }else if(s.length() == 0) {
            return true;
        }else if(t.length() == 0){
            return false;
        }

        boolean tab[][] = new boolean[s.length()][t.length()];

        for (int i = 0; i <s.length(); i++) {

            for (int j = i; j < t.length(); j++) {
                if (i==0 && j == 0) {
                    tab[i][j] = s.charAt(i) == t.charAt(j);
                    continue;
                }else if (i == 0) {
                    tab[i][j] = s.charAt(i) == t.charAt(j) ? true : tab[i][j-1];
                    continue;
                }

                if (s.charAt(i) == t.charAt(j)) {
                    tab[i][j] = tab[i-1][j-1];
                }else {
                    tab[i][j] = tab[i][j-1];
                }
            }
        }
        return tab[s.length()-1][t.length()-1];
    }
 }