/**
 * 剑指Offer，数组中出现次数超过一半的数字
 */

 public class MoreThanHalfNum {

     public static void main(String[] args) {
         int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(array));
     }

     public static int MoreThanHalfNum_Solution(int [] array) {

        if (array == null || array.length <= 0) {
            return 0;
        }
        
        int cnt = 0, currentNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                currentNum = array[i];
                continue;
            }
            if (array[i] == currentNum) {
                cnt++;
            }else{
                cnt--;
            }

        }

        cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == currentNum) {
                cnt++;
            }
        }

        if (cnt > array.length / 2) {
            return currentNum;
        }else{
            return 0;
        }
    }
 }