import javax.naming.spi.DirStateFactory.Result;

/**
 * 剑指Offer，数值的整数次方
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