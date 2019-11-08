
public class BackTrace{

    private static boolean flag[];

    public static void main(String[] args) {
       int nums[] = {1, 3};
        flag = new boolean[nums.length];
        for (int i = 0; i < flag.length; i++) {
            flag[i] = true;
        }
        int tmp[] = new int[nums.length];
       backtracking(nums, 0, tmp);
    }

    private static void backtracking(int nums[], int start, int[] tmp) {
        if (start >= nums.length) {
            for (int k : tmp) {
                System.out.print(k + "");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (flag[i]) {
                flag[i] = false;
                tmp[i] = nums[start];
                backtracking(nums, start+1, tmp);
                flag[i] = true;
            }
        }
    }

    private static void swap(int[] nums, int i, int start) {
        int tmp = nums[i];
        nums[i] = nums[start];
        nums[start] = tmp;
    }

    
}