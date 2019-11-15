/**
 * 剑指offer第一题
 * 二维数组中的查找
 */

public class FindInTwoArray{

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4, 5},
            {5, 6, 1, 2, 8}
        };
        Find(3, array);
    }

    public static boolean Find(int target, int [][] array) {
        int line = array.length;
        int column = array[0].length;

        int i = 0, j = column-1;
        while (true) {
            if (i > line || j < 0) {
                return false;
            }

            if (array[i][j] == target) {
                return true;
            }else if (array[i][j] > target) {
                j--;
            }else{
                i++;
            }
        }
    }

    
 }