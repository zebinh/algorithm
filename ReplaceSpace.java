/**
 * ½£Ö¸Offer£¬Ìæ»»¿Õ¸ñ
 */

 public class ReplaceSpace{

    public static void main(String[] args) {
        
        StringBuffer str = new StringBuffer("hello world");
    
        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(StringBuffer str) {
        
        for (int i = 0; i < str.length(); i++) {
            System.out.println(String.valueOf(str.charAt(i)));
            if (String.valueOf(str.charAt(i)) == " ") {
                System.out.println("h");
                str.replace(i, i+1, "%20");
            }
        }
        return str.toString();
    }
 }