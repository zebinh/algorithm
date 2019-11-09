import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

/**
 * È«ÅÅÁĞ
 */

 public class Permutations0046{

    

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        permute(nums);
        for (List<Integer> l : result) {
            for (int i : l) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    // ===========

    static List<List<Integer>> result = new ArrayList<List<Integer>>();
    static boolean flag[];

    public static List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<List<Integer>>();
        flag = new boolean[nums.length];
        for (int i = 0; i < flag.length; i++) {
            flag[i] = true;
        }
        int tmp[] = new int[nums.length];
       backtracking(nums, 0, tmp);
       return result;
    }

    private static void backtracking(int nums[], int start, int[] tmp) {
        if (start >= nums.length) {
            List<Integer> tlist = new ArrayList<>();
            for (int i : tmp) {
                tlist.add(i);
            }
            result.add(tlist);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (flag[i]) {
                flag[i] = false;
                tmp[i] = nums[start];
                backtracking(nums, start+1, tmp);
                flag[i] = true;
            }
        }
    }
 }