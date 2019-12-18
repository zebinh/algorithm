
/**
 * 剑指Offer，数字在排序数组中出现的次数
 */

public class NumberAppearanceCountInSortArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8};
        System.out.println(GetNumberOfK(array, 5));
    }

    public static int GetNumberOfK(int [] array , int k) {

        if (array == null || array.length <= 0) {
            return 0;
        }
       
        int left = 0;
        int right = array.length - 1;
        int index = 0;
        while (true) {
            index = left + (right - left) / 2;
            if (array[index] == k || left == right) {
                break;
            }
            if (array[index] > k) {
                right = index - 1;
            }else {
                left = index + 1;
            }
        }

        int cnt = 0;
        for (int i = index; i >= 0; i--) {
            if (array[i] == k) {
                cnt++;
            }else {
                break;
            }
        }

        for (int i = index + 1; i < array.length; i++) {
            if (array[i] == k) {
                cnt++;
            }else {
                break;
            }
        }

        return cnt;
    }
}