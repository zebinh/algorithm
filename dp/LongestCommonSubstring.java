
/**
 * 最长公共子串
 */
public class LongestCommonSubstring{

    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "abcagabcdef";

        int tab[][] = new int[str1.length()][str2.length()];

        int maxValue = 0;

        // 子串2在子串1中查找
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (i == 0) {
                    tab[i][j] = str2.charAt(j) == str1.charAt(i) ? 1 : 0;
                }else if (j == 0) {
                    tab[i][j] = str2.charAt(j) == str1.charAt(i) ? 1 : 0;
                }else if (str2.charAt(j) == str1.charAt(i)){
                    tab[i][j] = tab[i-1][j-1] + 1;
                }else{
                    tab[i][j] = 0;
                }
                maxValue = Math.max(maxValue, tab[i][j]);
            }
        }
        System.out.println(maxValue);
    }
}