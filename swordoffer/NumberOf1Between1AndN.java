/**
 * 剑指Offer，整数中1出现的次数
 */

public class NumberOf1Between1AndN {

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }

    public static int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            while (tmp > 0) {
                if (tmp % 10 == 1) {
                    cnt++;
                } 
                tmp = tmp / 10;
            }
        }
        return cnt;
    }
}