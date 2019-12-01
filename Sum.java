/**
 * ����˼����1�ӵ�n�޷���ֵ���з���ֵ����
 */

 public class Sum {

    public static void main(String[] args){
        System.out.println(recursiveReturnInt(5));
        recursiveReturnVoid(5, 0);
    }

    // �з���ֵ�ĵݹ�д��
    public static int recursiveReturnInt(int n){
        if (n == 0) {
            return 0;
        }
        return n + recursiveReturnInt(n - 1);
    }

    // �޷���ֵ�ĵݹ�д��
    public static void recursiveReturnVoid(int n, int sum){

        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        recursiveReturnVoid(n - 1, sum);
        
    }
 }