/**
 * ¶¯Ì¬¹æ»®£ºÅÀÂ¥Ìİ
 */

 public class ClimbingStairs0070{

    public static void main(String[] args) {
        
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {

            if (i == 0) {
                c[i] = 1;
                continue;
            }else if (i == 1) {
                c[i] = 2;
                continue;
            }
            c[i] = c[i-2] + c[i-1];
        }
        return c[n-1];
    }
 }