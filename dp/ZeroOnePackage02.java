
/**
 *  《图解算法》中的原理实现
 */
public class ZeroOnePackage02{

    public static void main(String[] args) {
        
        // 物品数量
        int N = 5;        
        // 背包承重
        int W = 12;
        // 物品重量
        int w[] = {3, 5, 2, 6, 4};
        // 物品价值
        int v[] = {4, 4, 3, 5, 3};

        int tab[][] = new int[N][W];
       
        // i, j 指针
        for (int i = 0; i < N; i++) {
            for ( int j=0; j < W; j++) {
                // 第一行要特殊处理
                if (i == 0) {
                    if (w[i] > j + 1) {
                        tab[i][j] = 0;
                    }else{
                        tab[i][j] = tab[i][j-1];
                    }
                } else {
                    if (w[i] > j + 1){
                        tab[i][j] = tab[i - 1][j];
                    }else{
                        tab[i][j] = Math.max(tab[i - 1][j], v[i] + tab[i - 1][j + 1 - w[i]]);
                    }
                }
            }
        }

        System.out.println(tab[N-1][W-1]);
       
    }
}