/**
 * À„∑® - ∫Ï±¶ È
 * —°‘Ò≈≈–Ú
 */
public class SelectionSort {
    public static int[] sortArray(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            int min = nums[index];
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) {
                    index = j;
                    min = nums[index];
                }
            }
            int tmp = nums[i];
            nums[i] = nums[index];
            nums[index] = tmp;
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