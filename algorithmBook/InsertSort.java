/**
 * À„∑® - ∫Ï±¶ È
 * ≤Â»Î≈≈–Ú
 */
public class InsertSort {

    public static int[] sortArray(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int tmp = nums[i];
            int j = i - 1;
            while (j >=0 && nums[j] > tmp) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,-8,-10};
        sortArray(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}