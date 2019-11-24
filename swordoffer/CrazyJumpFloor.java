/**
 * ½£Ö¸Offer£¬±äÌ¬ÌøÌ¨½×
 */

 public class CrazyJumpFloor {

    public static void main(String[] args) {
        System.out.println(JumpFloorII(3));
    }

    public static int JumpFloorII(int target) {
        
        if (target == 0 ||  target == 1) {
            return 1;
        }

        int count = 0;
        while (target > 0) {
            count += JumpFloorII(target-1);
            target--;
        }
        return count;

    }
 }