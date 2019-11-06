
public class ZeroOnePackage{

    public static void main(String[] args) {
        
        // ��Ʒ����
        int N = 5;        
        // ��������
        int W = 12;
        // ��Ʒ����
        int w[] = {3, 5, 2, 6, 4};
        // ��Ʒ��ֵ
        int v[] = {4, 4, 3, 5, 3};

        int tab[][] = new int[N+1][W+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (w[i-1] > j) {
                    tab[i][j] = tab[i-1][j];
                }else {
                    tab[i][j] = Math.max(tab[i-1][j], v[i-1] + tab[i-1][j - w[i-1]]);
                }
            }
        }
        System.out.println(tab[N][W]);
       
    }
}