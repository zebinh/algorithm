/**
 * 剑指Offer，数组中只出现一次的数字
 */

public class FindTwoNumsAppearOnce {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 2, 3, 4, 1};
        int[] num1 = new int[1];
        int[] num2 = new int[2];
        FindNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0] + ", " + num2[0]);
    }

    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        
        int mix = 0;
        for (int i = 0; i < array.length; i++) {
            mix = mix ^ array[i];
        }

        int mask = 1;
        while ( (mask & mix) == 0) {
            mask = mask << 1;
        }

        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < array.length; i++) {
            if ( (mask & array[i]) == 0) {
                result1 = result1 ^ array[i];
            }else {
                result2 = result2 ^ array[i];
            }
        }

        num1[0] = result1;
        num2[0] = result2;
    }
}