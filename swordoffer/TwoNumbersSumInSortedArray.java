/**
 * 剑指Offer，和为S的两个数字
 */
import java.util.ArrayList;
public class TwoNumbersSumInSortedArray {

    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                result.add(array[i]);
                result.add(array[j]);
                return result;
            }else if (array[i] + array[j] < sum) {
                i++;
            }else{
                j--;
            }
        }
        return result;
    }
}