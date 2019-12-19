/**
 *  剑指Offer，把字符串转成整数
 */

public class StringToInt {

    public static void main(String[] args) {
        System.out.println(StrToInt("-2147483649"));
    }

    public static int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) != '+' && str.charAt(0) != '-'  && !(str.charAt(0) >= '0' && str.charAt(0) <= '9')) {
            return 0;
        }
        for (int i = 1; i < str.length(); i++) {
            if (! (str.charAt(i) >= '0' && str.charAt(i) <= '9') ) {
                return 0;
            }
        }
        int sum = 0;
        int base = 1;
        for (int i = str.length() - 1; i > 0; i--) {
            sum += (str.charAt(i) - '0' ) * base;
            base *= 10;
        }
        if (str.charAt(0) == '+') {
             if (sum < 0) {
                 sum = 0;
             }
        }else if(str.charAt(0) == '-') {
            sum = 0-sum;
            if (sum > 0) {
                sum = 0;
            }
        }else{
            sum += (str.charAt(0) - '0' ) * base;
            if (sum < 0) {
                sum = 0;
            }
        }
        
        return sum;
    }
    
}