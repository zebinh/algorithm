import java.util.ArrayList;

/**
 * ��ָOffer��˳ʱ���ӡ����
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

            // �����Ҵ�ӡһ��
            for (int i = left; i <= right; i++) {
                result.add(matrix[up][i]);
            }
            up++;

            // ���ϵ��´�ӡһ��
            for (int i = up; i <= down; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // ���ҵ����ӡһ��
            for (int i = right; i >= left && up <= down; i--) {
                result.add(matrix[down][i]);
            }
            down--;

            // ���µ��ϴ�ӡһ��
            for (int i = down; i >= up && left <= right; i--) {
                result.add(matrix[i][left]);
            }
            left++;

        }

        return result;
    }
 }