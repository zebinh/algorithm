/**
 * 动态规划：最大子序和
 */

 public class MaximumSubarray0053{

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
     
        int r[] = new int[nums.length];

        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                r[i] = nums[i];
                sum = nums[i];
                continue;
            }
            r[i] = Math.max(r[i-1]+nums[i], nums[i]);
            if (r[i] >= sum) {
                sum = r[i];
            }
        }
        return sum;
    }
 }