/**
 * V2EX��V����Ŀ
 * 
 *  ��Ŀ������ a �ֳ� b ���γ�һ����ά���飨ÿ�������Ԫ�ظ���������С�������ұ�֤ԭ�����˳�򲻱䣬��
* [1,2,3,4,5,6,7] �ֳ� 3 ����Ϊ��[[1,2],[3,4],[,5,6,7]] ����[[1,2,3],[4,5],[6,7]] �����𰸶����ԣ�ֻ������������
*
* ˼·��a.length / bΪ����Ԫ�ظ�����a.length % bΪ������ĸ��������䵽n���ڵ�ĳ���鼴��
 */

public class V2EXTest {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int b = 3;
        StringBuffer result = new StringBuffer();

        int index = 0;

        // a.length % b��ÿ��Ϊa.length / b + 1 ��Ԫ��
        for (int i = 0; i < a.length % b; i++) {
            for (int j = 0; j < a.length / b + 1; j++) {
                result.append(a[index]);
                result.append(" ");
                index++;
            }
            result.append(",");
        }

        // ʣ�µ�b - a.length % b��ÿ��Ϊa.length/b��Ԫ��
        for (int i = 0; i < b - a.length % b; i++) {
            for (int j = 0; j < a.length / b; j++) {
                result.append(a[index]);
                result.append(" ");
                index++;
            }
            result.append(",");
        }

        // ��ӡ���
        System.out.println(result.toString());
    }
}