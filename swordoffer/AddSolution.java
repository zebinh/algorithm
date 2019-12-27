/**
 * 剑指Offer，不用加减乘除做加法
 */

public class AddSolution {

    public static void main(String[] args) {
       System.out.println(Add(111, 899));
    }

    public static int Add(int num1,int num2) {
        
        return num2 != 0 ? Add(num1 ^ num2, (num1 & num2) << 1 ) : num1;
    }
}