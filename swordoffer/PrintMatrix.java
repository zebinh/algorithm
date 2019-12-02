import java.util.ArrayList;

/**
 * 剑指Offer，顺时针打印矩阵
 */

 public class PrintMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5}
        };

        ArrayList<Integer> list = printMatrix(matrix);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
       
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        ArrayList<Integer> result = new ArrayList<>();
        int up = 0, left = 0, down = matrix.length - 1, right = matrix[0].length - 1;
        while (left <= right && up <= down) {

            // 从左到右打印一行
            for (int i = left; i <= right; i++) {
                result.add(matrix[up][i]);
            }
            up++;

            // 从上到下打印一列
            for (int i = up; i <= down; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // 从右到左打印一行
            for (int i = right; i >= left && up <= down; i--) {
                result.add(matrix[down][i]);
            }
            down--;

            // 从下到上打印一列
            for (int i = down; i >= up && left <= right; i--) {
                result.add(matrix[i][left]);
            }
            left++;

        }

        return result;
    }
 }