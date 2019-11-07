import java.util.ArrayList;
import java.util.List;

/**
 * leetcode���ݷ����Ӽ�
 * ����Ƚ��ѣ������㷨�ľ�������ƽ������ĸ���Դ��ģ�
 */

 public class Subsets0078{

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        subsets(nums);
    }

    private static List<List<Integer>> result = new ArrayList<List<Integer>>();

    public static List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> tmp = new ArrayList<>();
        backtrack(nums, 0, tmp);
        return result;
    }

    private static void backtrack(int[] nums, int start, List<Integer> tmp) {

        result.add(new ArrayList<>(tmp));

        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]);
            backtrack(nums, i+1, tmp);
            tmp.remove(tmp.size()-1);
        }
        for (int j : tmp) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
 }