/**
 * 最大子序和，分治法版本
 * 以前使用动态规划解，这版是分治法
 * 
 */

public class MaximumSubarray005302{

    public static void main(String[] args) {
        int nums[] = {-2, -1};
        maxSubArray(nums);

    }

    
    public static int maxSubArray(int[] nums) {
        
        int result = maxSum(nums, 0, nums.length-1);
        System.out.println(result);
        return result;
    }

    private static int maxSum(int[] nums, int start, int end) {

        if (start >= end) {
            return nums[start];
        }

        int mid = (start + end) / 2;
        int leftMaxSum = maxSum(nums, start, mid);
        int rightMaxSum = maxSum(nums, mid+1, end);

        int tmpMaxLeft = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = mid; i >= start; i--) {
            tmp += nums[i];
            tmpMaxLeft = tmp >= tmpMaxLeft ? tmp : tmpMaxLeft;
        }

        int tmpMaxRight = Integer.MIN_VALUE;
        tmp =0;
        for (int i = mid+1; i <= end; i++) {
            tmp += nums[i];
            tmpMaxRight = tmp >= tmpMaxRight ? tmp : tmpMaxRight;
        }

        return Math.max(leftMaxSum, Math.max(rightMaxSum , tmpMaxLeft + tmpMaxRight));
        
    }
 }