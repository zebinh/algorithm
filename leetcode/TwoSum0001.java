import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 两数之和
 */

 public class TwoSum0001{

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int[] result = twoSum(nums, 9);
        System.out.println(result[0] + ": " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> container = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (container.containsKey(tmp)) {
                return new int[]{container.get(tmp), i};
            }
            container.put(nums[i], i);
        }
        return null;
    }
 }