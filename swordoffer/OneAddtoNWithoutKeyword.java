
/**
 * ��ָOffer����ʹ���жϹؼ��ּ���1�ӵ�n
 */
public class OneAddtoNWithoutKeyword {
    
    public static void main(String[] args) {
        System.out.println(Sum_Solution(5));
    }
    
    public static int Sum_Solution(int n) {
        int sum = n;
        boolean t = (n > 0) && (sum += Sum_Solution(n - 1)) > 0;
        return sum;
    }
}