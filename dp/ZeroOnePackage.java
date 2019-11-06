
public class ZeroOnePackage{

    public static void main(String[] args) {
        
        // 物品数量
        int N = 5;        
        // 背包承重
        int W = 12;
        // 物品重量
        int w[] = {3, 5, 2, 6, 4};
        // 物品价值
        int v[] = {4, 4, 3, 5, 3};

        // 纵坐标为物品，横坐标为子背包承重，左上角横纵列默认为0
        int tab[][] = new int[N+1][W+1];

        // 一个物品一个物品计算是否装入背包
        for (int i = 1; i <= N; i++) {

            // 承重为0到W的子背包
            for (int j = 1; j <= W;  j++) {
                // 如果i个物品重量超过当前背包，则不装入
                if (w[i - 1] > j) {
                    tab[i][j] = tab[i - 1][j];
                }else {
                    // 衡量当前物品是否装入背包
                    tab[i][j] = Math.max(tab[i  - 1][j], v[i - 1] + tab[i - 1][j - w[i-1]]);
                }
            }
        }
        System.out.println(tab[N][W]);
    }
}