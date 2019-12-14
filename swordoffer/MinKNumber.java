import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 剑指Offer，最小的K个数
 */

public class MinKNumber {

    public static void main(String[] args) {
        int[] input = {4,5,1,6,2,7,3,8};
        int k = 10;
        ArrayList<Integer> l = GetLeastNumbers_Solution(input, k);
        for (int i : l) {
            System.out.print(i + ",");
        }
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        
        ArrayList<Integer> result = new ArrayList<>();

        if (input == null || input.length <= 0) {
            return result;
        }

        if (k > input.length || k <= 0) {
            return result;
        }

        int left = 0; 
        int right = input.length - 1;
        int index = partition(input, left, right);
        while (index != k - 1) {
            
            if (index > k - 1) {
                right = index - 1;
            }else{
                left = index + 1;
            }

            index = partition(input, left, right);
        }

        for (int i = 0; i < k; i++) {
            result.add(input[i]);
        }
        return result;
    }

    public static int partition(int[] input, int left, int right) {

        int pivot = input[right];
        int i = 0, j = right;
        while (i < j) {
            while (i < j && input[i] <= pivot) {
                i++;
            }
            input[j] = input[i];
            while (i < j && input[j] >= pivot) {
                j--;
            }
            input[i] = input[j];
        }
        input[i] = pivot;
        return i;
    }
}