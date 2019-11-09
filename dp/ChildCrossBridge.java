/**
 * 动态规划：小朋友过河
 */

 public class ChildCrossBridge{
     
    public static void main(String[] args) {
        int n = 4;
        int c[] = new int[]{1, 2, 5, 10};

        int tab[] = new int[n];
        for (int i=0; i <n; i++) {
            if (i == 0 || i ==1) {
                tab[i] = c[i];
                continue;
            }
            tab[i] = tab[i-1] + i;
        }
    }
 }