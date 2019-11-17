/**
 * ½£Ö¸Offer£¬Ìæ»»¿Õ¸ñ
 */

 public class ReplaceSpace{

    public static void main(String[] args) {
        
        StringBuffer str = new StringBuffer("hello world  !");
    
        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(StringBuffer str) {
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.replace(i, i+1, "%20");
            }
        }
        return str.toString();
    }
 }