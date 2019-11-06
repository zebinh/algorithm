/**
 *  动态规划：钢条切割
 *  解题思路：最初想成背包问题，先画了二维数组图填表，按照这个思路，自然而然发现行不通，就用了一维数据解决。
 */

 public class SteelBarCut{

    public static void main(String[] args) {
        
        // 钢条可切割长度
        int l[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 钢条长度对应的价格表
        int p[] = new int[]{1, 5, 8, 9, 17, 17, 20, 20, 24, 30};

        // 需要切割的钢条长度
        int n = 4;
        int tab[] = new int[n];

        // 从0到n-1的数组表示钢条切割最优化表
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                p[i] = 1;
            }else{
                // 不切割时
                int maxValue = p[i];
                // 如果第一段切成1，切成2，遍历获取最大值
                for (int j = 1; j <= i; j++) {
                    maxValue = Math.max(maxValue, p[j-1] + p[i - j]);
                }
                p[i] = maxValue;
            }

        }
        System.out.println(p[n-1]);
    }
 }