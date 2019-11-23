/**
 * 剑指offer，旋转数组的最小数字
 */

 public class RotateArrayMinNum {

    public static void main(String[] args) {
        int[] array = {3, 4, 4, 5, 1, 2};
        System.out.println(minNumberInRotateArray(array));
    }

    public static int minNumberInRotateArray(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i+1]) {
                return array[i+1];
            }
        }
        return array[0];
    }
 }