import java.util.ArrayList;
import java.util.Stack;

/**
 *  剑指Offer，栈的压入弹出序列
 */

public class IsStackPopOrder {

    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 3, 5, 1, 2};
        System.out.println(IsPopOrder(pushA, popA));
    }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        
        Stack<Integer> ss = new Stack<>();

        for (int i = 0, j = 0; i < pushA.length; i++) {
            ss.push(pushA[i]);
            while (!ss.isEmpty() && ss.peek().intValue() == popA[j]) {
                ss.pop();
                j++;
            }
        }
        if (ss.isEmpty()) {
            return true;
        }
        return false;
    }
}