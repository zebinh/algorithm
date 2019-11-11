/**
 * µÚK´óÔªËØ
 */

public class KthLargestElementinanArray0215 {

    public static void main(String[] args) {
        
        int nums[] = {3,2,1,5,6,4};
        findKthLargest(nums, 2);
    }

    // ===============
    public static int findKthLargest(int[] nums, int k) {
            
        int i = quickSelect(nums, 0, nums.length-1, k);
        //System.out.println(i);
        return i;
    }

    private static int quickSelect(int[] nums, int start, int end, int k) {

        int i = start;
        int j = end; 
        int tmp = nums[j];

        while (i < j) {

            while (i < j && nums[i] > tmp) {
                i++;
            }
            nums[j] = nums[i];

            while (i < j && nums[j] <= tmp) {
                j--;
            }
            nums[i] = nums[j];
        }
        nums[i] = tmp;

        if (k == i+1) {
            return nums[i];
        }
        if (k > i+1) {
            int result = quickSelect(nums, i+1, end, k);
            return result;
        }else if (k < i+1) {
            int result = quickSelect(nums, start, i-1, k);
            return result;
        }else{
            return -1;
        }
    }


 }