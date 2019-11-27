import javax.naming.spi.DirStateFactory.Result;

/**
 * ��ָOffer����ֵ�������η�
 */

 public class BaseExponent {

    public static void main(String[] args) {
        System.out.println(Power(2, -3));
    }

    public static double Power(double base, int exponent) {
        
        if (exponent == 0) {
            return 1;
        }

        double r = 1;
        int cnt = Math.abs(exponent);
        for (int i = 0; i < cnt; i++) {
            r *= base;
        }

        return exponent >0 ? r : 1/r;
    }
 }