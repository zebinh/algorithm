public class MazeTest{

    //  迷宫，9行8列
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
        
        // 从左上角开始走迷宫
        walk(0, 0);
    }

    public static void walk(int i , int j){

        // 如果到达右下角，说明该路线可以走通
        if (i >= ROW-1 && j >= COLUMN-1) {
            //  打印当前迷宫痕迹
            System.out.println("找到一种解法如下：====");
            for (int r = 0; r < ROW; r++) {
                for (int c = 0; c < COLUMN; c++) {
                    System.out.print(maze[r][c]);
                }
                System.out.println();
            }
            return;
        } // ===打印迷宫结束

        // 向右走，先查查是否可以站在这个i, j+1 这个点上
        if (canStand(i, j)) {
            // 可以站在这个点上，站上去（标记已走过）
            maze[i][j] = 6;
            walk(i, j+1); // 往右走，进入下一个历史宇宙
            // 在最右边历史宇宙撞墙了，这个宇宙上面把这个点改为6了，需要改回来，否则篡改历史，会引发未知的蝴蝶效应
            maze[i][j] = 1;
        }

        // 在最右历史宇宙中走不下去，向下走
        if (canStand(i, j)) {
            maze[i][j] = 6;
            walk(i+1, j);
            maze[i][j] = 1;
        }

        // 向左走
        if (canStand(i, j)) {
            maze[i][j] = 6;
            walk(i, j-1);
            maze[i][j] = 1;
        }

        // 向上走
        if (canStand(i, j)) {
            maze[i][j] = 6;
            walk(i - 1, j);
            maze[i][j] = 1;
        }

    }

    private static boolean canStand(int i, int j) {
        //System.out.print("[" + i + "," + j + "]=>");
        //  走到边界了
        if (i >= ROW || j >= COLUMN || i < 0 || j < 0) {
            return false;
        }

        // 遇到障碍了
        if (maze[i][j] == 0) {
            return false;
        }

        // 走过了
        if (maze[i][j] == 6) {
            return false;
        }

        return true;
    }
}