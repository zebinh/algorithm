/**
 * Ëã·¨ - ºì±¦Êé
 * Ï£¶ûÅÅĞò
 */

public class ShellSort {
    public static int[] sortArray(int[] nums) {

        for (int step = nums.length / 2; step > 0; step /= 2) {
            for (int i = step; i < nums.length; i++) {
                int tmp = nums[i];
                int j = i;
                for (; j >= step && nums[j-step] > tmp; j -= step) {
                    nums[j] = nums[j - step];
                }
                nums[j] = tmp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 3, 1};
        sortArray(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
