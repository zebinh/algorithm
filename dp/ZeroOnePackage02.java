
/**
 *  ��ͼ���㷨���е�ԭ��ʵ��
 */
public class ZeroOnePackage02{

    public static void main(String[] args) {
        
        // ��Ʒ����
        int N = 5;        
        // ��������
        int W = 12;
        // ��Ʒ����
        int w[] = {3, 5, 2, 6, 4};
        // ��Ʒ��ֵ
        int v[] = {4, 4, 3, 5, 3};

        int tab[][] = new int[N][W];
       
        // i, j ָ��
        for (int i = 0; i < N; i++) {
            for ( int j=0; j < W; j++) {
                // ��һ��Ҫ���⴦��
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