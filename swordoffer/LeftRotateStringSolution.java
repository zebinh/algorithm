/**
 * ½£Ö¸Offer£¬×óÐý×ª×Ö·û´®
 */

public class LeftRotateStringSolution {

    public static void main(String[] args) {
        
        System.out.println(LeftRotateString("abcXYZdef", 3));
    }

    public static String LeftRotateString(String str,int n) {
        
        if(str == null || str.length() <= 0) {
            return str;
        }

        n = n % str.length();
        return str.substring(n, str.length()) + str.substring(0, n);
    }
}