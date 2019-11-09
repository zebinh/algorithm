/**
 * ¥Ûº“ΩŸ…·
 */

 public class HouseRobber0198{

    public static void main(String[] args) {
        int nums[] = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {

        if (nums == null || nums.length <= 0) {
            return 0;
        }
        
        int r[] = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            if (i == 0) {
                r[i] = nums[i];
            }else if (i == 1) {
                r[i] = Math.max(nums[i-1], nums[i]);
            }else {
                r[i] = Math.max(r[i-1], r[i-2] + nums[i]);
            }

        }
        return r[nums.length-1];
    }
 }