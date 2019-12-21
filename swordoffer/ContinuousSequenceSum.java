/**
 * 剑指Offer，和为S的连续正数序列
 */
import java.util.ArrayList;
public class ContinuousSequenceSum {

    public static void main(String[] args) {
        FindContinuousSequence(100);
    }

    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        
        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        int begin = 1;
        int end = 2;
        int curSum = 3;
        while (true) {
            System.out.println(begin + " " + end);
            if (begin > sum / 2 || end > sum) {
                break;
            }

            if (curSum == sum) {
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int i = begin; i <= end; i++){
                    tmp.add(i);
                }
                r.add(tmp);
                end++;
                curSum += end;
            }else if (curSum < sum) {
                end++;
                curSum += end;
            }else{
                curSum -= begin;
                begin++;
            }
           
        }
       return r;
    }
}