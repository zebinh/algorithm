/**
 *  剑指Offer，把数组排成最小的数
 */

import java.util.ArrayList;
import java.lang.Integer;

public class SortToMinNumber {

    public static void main(final String[] args) {
        final int[] numbers = {3334,3,3333332};
        System.out.println(PrintMinNumber(numbers));
    }

    public static String PrintMinNumber(final int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                long val1 = Long.valueOf(numbers[j] + "" + numbers[j+1]);
                long val2 = Long.valueOf(numbers[j+1] + "" + numbers[j]);
                if (val1 > val2) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }

        String rStr = "";
        for (int i = 0; i < numbers.length; i++) {
            rStr += numbers[i];
        }

        return rStr;
    }
}