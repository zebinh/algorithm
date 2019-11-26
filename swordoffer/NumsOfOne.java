/**
 * 剑指Offer，二进制中的整数
 */

 public class NumsOfOne {
     public static void main(String[] args) {
        System.out.println(NumberOf1(7));
     }

     public static int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n = n&n-1;
        }
        return cnt;
    }
 }