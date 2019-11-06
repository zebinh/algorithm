/**
 * ��̬�滮����С������¥��
 * ����ʹ��whileѭ����ʹ��forѭ���������
 */

 public class MinCostClimbingStairs0746{

    public static void main(String[] args) {
        int cost[] ={10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        
        int i = 0;

        int r[] = new int[cost.length + 1];
        while (true) {

            if (i == 0 || i == 1){
                r[i] = 0;
                i++;
                continue;
            }

            r[i] = Math.min(cost[i-2] + r[i-2], cost[i-1] + r[i-1]);
            if (i >= cost.length) {
                break;
            }
            i++;
        }
        return r[cost.length];
         
    }
}