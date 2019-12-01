/**
 * leetcode1137，第N个斐波那契数
 */

 public class NthTribonacciNumber {
     public static void main(String[] args) {
        System.out.println( tribonacci(34));
     }

     // ===============

     static int[] store = new int[64];
     public static int tribonacci(int n) {

        if (n == 0) {
            return 0;
        }else if (n == 1 || n == 2) {
            return 1;
        }else if (store[n] != 0) {
            return store[n];
        }

        int tmp = tribonacci(n - 1);
        store[n - 1] = tmp; 
        return tmp + tribonacci(n - 2) + tribonacci(n - 3);
    }
 }