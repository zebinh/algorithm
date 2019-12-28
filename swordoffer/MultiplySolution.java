/**
 * 
 */
import java.util.ArrayList;
public class MultiplySolution {


    public int[] multiply(int[] A) {

        int tmp = 1;
        int[] L = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            L[i] = tmp * A[i];
            tmp = L[i];
        }
        tmp = 1;
        int[] R = new int[A.length];
        for (int i = A.length - 1; i >= 0; i --) {
            R[i] = tmp * A[i];
            tmp = R[i];
        }

        int[] B = new int[A.length];
        B[0] = R[1];
        B[A.length-1] = L[A.length-2];
        for (int i = 1; i < A.length - 1; i++) {
            B[i] = L[i-1] * R[i+1];
        }
        return B;
    }
}