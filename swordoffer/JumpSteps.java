/**
 * ½£Ö¸offer£¬ÇàÍÜÌøÌ¨½×
 */

 public class JumpSteps {

    public static void main(String[] args) {
        System.out.println(JumpFloor(4));
    }

    public static int JumpFloor(int target) {

        int[] result = new int[target+1];

        for (int i = 0; i <= target; i++) {
            if (i == 0 || i == 1 || i == 2) {
                result[i] = i;
            }else {
                result[i] = result[i-1] + result[i-2];
            }
        }
        return result[target];
    }
 }