/**
 * 剑指Offer，调整数组顺序使奇数位于偶数前面
 */

 public class AdjustArray {

    public static void main(String[] args) {
        int[] array = {2,4,6,1,3,5,7};
        reOrderArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void reOrderArray(int [] array) {
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] % 2 == 0 && array[j+1] % 2 == 1) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                } 
            }
        }
        
    }
 }