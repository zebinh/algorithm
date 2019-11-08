public class MazeTest{

    //  �Թ���9��8��
    private static int ROW = 9;
    private static int COLUMN = 8;
    private static int[][] maze = {
        {1, 1, 0, 1, 1, 1, 0, 1},
        {1, 1, 0, 1, 1, 1, 0, 1},
        {1, 1, 0, 1, 0, 0, 1, 0},
        {1, 0, 0, 0, 1, 1, 0, 1},
        {1, 1, 1, 0, 1, 1, 1, 1},
        {1, 0, 1, 1, 1, 0, 1, 0},
        {1, 0, 0, 0, 0, 1, 1, 0},
        {0, 0, 1, 1, 1, 0, 1, 0},
        {0, 0, 1, 1, 1, 1, 1, 1}
    };


    public static void main(String[] args) {
        
        // �����Ͻǿ�ʼ���Թ�
        walk(0, 0);
    }

    public static void walk(int i , int j){

        // ����������½ǣ�˵����·�߿�����ͨ
        if (i >= ROW-1 && j >= COLUMN-1) {
            //  ��ӡ��ǰ�Թ��ۼ�
            System.out.println("�ҵ�һ�ֽⷨ���£�====");
            for (int r = 0; r < ROW; r++) {
                for (int c = 0; c < COLUMN; c++) {
                    System.out.print(maze[r][c]);
                }
                System.out.println();
            }
            return;
        } // ===��ӡ�Թ�����

        // �����ߣ��Ȳ���Ƿ����վ�����i, j+1 �������
        if (canStand(i, j)) {
            // ����վ��������ϣ�վ��ȥ��������߹���
            maze[i][j] = 6;
            walk(i, j+1); // �����ߣ�������һ����ʷ����
            // �����ұ���ʷ����ײǽ�ˣ�������������������Ϊ6�ˣ���Ҫ�Ļ���������۸���ʷ��������δ֪�ĺ���ЧӦ
            maze[i][j] = 1;
        }

        // ��������ʷ�������߲���ȥ��������
        if (canStand(i, j)) {
            maze[i][j] = 6;
            walk(i+1, j);
            maze[i][j] = 1;
        }

        // ������
        if (canStand(i, j)) {
            maze[i][j] = 6;
            walk(i, j-1);
            maze[i][j] = 1;
        }

        // ������
        if (canStand(i, j)) {
            maze[i][j] = 6;
            walk(i - 1, j);
            maze[i][j] = 1;
        }

    }

    private static boolean canStand(int i, int j) {
        //System.out.print("[" + i + "," + j + "]=>");
        //  �ߵ��߽���
        if (i >= ROW || j >= COLUMN || i < 0 || j < 0) {
            return false;
        }

        // �����ϰ���
        if (maze[i][j] == 0) {
            return false;
        }

        // �߹���
        if (maze[i][j] == 6) {
            return false;
        }

        return true;
    }
}