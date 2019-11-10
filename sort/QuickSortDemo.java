/**
 * 快排
 */

 public class QuickSortDemo{

    public static void main(String[] args) {
        int nums[] = {2, 4, 46, 78, 10, 1, 13, 7, 5, 9, 23};
        quickSort(nums, 0, 10);
        
    }

    public static void quickSort(int nums[], int left, int right){
        if (left < 0 || right < 0 || left >= right) {
            return;
        }
        System.out.println("left: " + left + ", right: " + right);
        int i = left; 
        int j = right;
        // 分治
        int tmp = nums[j];
        
        while (i < j) {

            while (nums[i] <= tmp && i < j) {
                i++;
            }
            nums[j] = nums[i];

            while (nums[j] >= tmp && i < j) {
                j--;
            }
            nums[i] = nums[j];

        }
        nums[i] = tmp;
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        quickSort(nums, left, i-1);
        quickSort(nums, i+1, right);
        
    }



 }