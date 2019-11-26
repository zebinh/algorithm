/**
 * ½£Ö¸Offer£¬¾ØÐÎ¸²¸Ç
 */

public class RectangleCover {
    public static void main(String[] args) {
       System.out.println(RectCover(4));
    }

    public static int RectCover(int target) {

       if (target == 0 || target == 1 || target == 2) {
           return target;
       }

       return RectCover(target-1) + RectCover(target-2);
   }
}