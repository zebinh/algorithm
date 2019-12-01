/**
 * 自我思考，1加到n无返回值和有返回值两种
 */

 public class Sum {

    public static void main(String[] args){
        System.out.println(recursiveReturnInt(5));
        recursiveReturnVoid(5, 0);
    }

    // 有返回值的递归写法
    public static int recursiveReturnInt(int n){
        if (n == 0) {
            return 0;
        }
        return n + recursiveReturnInt(n - 1);
    }

    // 无返回值的递归写法
    public static void recursiveReturnVoid(int n, int sum){

        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        recursiveReturnVoid(n - 1, sum);
        
    }
 }