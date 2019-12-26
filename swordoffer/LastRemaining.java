/**
 * 剑指Offer，孩子们的游戏
 */
import java.util.*;

public class LastRemaining {

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5, 3));
    }

    public static int LastRemaining_Solution(int n, int m) {

        if (n == 0 || m == 0) {
            return -1;
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        
        int cur = 0;
        while (list.size() > 1) {
           
            for (int i = 0; i < m; i++) {
                if (i == 0) {
                   cur--;
                }
                cur++;
                if (cur == list.size()) {
                    cur = 0;
                }
            }
            list.remove(cur);

        }
        return list.get(0);
    }
}