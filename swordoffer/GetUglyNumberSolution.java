/**
 * ½£Ö¸Offer£¬³óÊý
 */

public class GetUglyNumberSolution {

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(10));
    }

    public static int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        int[] un = new int[index];
        un[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;
        for(int i = 1; i < index; i++) {
            un[i] = Math.min(un[p2] * 2, Math.min(un[p3] * 3, un[p5] * 5));
            if (un[i] == un[p2] * 2) {
                p2++;
            }
            if(un[i] == un[p3] * 3) {
                p3++;
            }
            if(un[i] == un[p5] * 5) {
                p5++;
            }
        }
        return un[index-1];
    }
}