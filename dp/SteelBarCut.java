/**
 *  ��̬�滮�������и�
 *  ����˼·�������ɱ������⣬�Ȼ��˶�ά����ͼ����������˼·����Ȼ��Ȼ�����в�ͨ��������һά���ݽ����
 */

 public class SteelBarCut{

    public static void main(String[] args) {
        
        // �������и��
        int l[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // �������ȶ�Ӧ�ļ۸��
        int p[] = new int[]{1, 5, 8, 9, 17, 17, 20, 20, 24, 30};

        // ��Ҫ�и�ĸ�������
        int n = 4;
        int tab[] = new int[n];

        // ��0��n-1�������ʾ�����и����Ż���
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                p[i] = 1;
            }else{
                // ���и�ʱ
                int maxValue = p[i];
                // �����һ���г�1���г�2��������ȡ���ֵ
                for (int j = 1; j <= i; j++) {
                    maxValue = Math.max(maxValue, p[j-1] + p[i - j]);
                }
                p[i] = maxValue;
            }

        }
        System.out.println(p[n-1]);
    }
 }