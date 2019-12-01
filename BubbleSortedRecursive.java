/**
 * 自我思考，冒泡排序的递归写法
 */

public class BubbleSortedRecursive {

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 9, 2, 5, 6, 7, 0};
        sort(array, 8);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] array, int len) {

        if (len < 0) {
            return;
        }

        for (int i = 0; i < len; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }
        sort(array, len-1);
    }
 }