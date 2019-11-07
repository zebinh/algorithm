/**
 * 买卖股票的最佳时机
 */

 public class BestTimetoBuyandSellStock0121{

    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        
        int v[] = new int[prices.length];

        int minValue = -1;
        int maxValue = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                v[i] = 0;
                minValue = prices[i];
                continue;
            }
            v[i] = Math.max(v[i-1], prices[i]-minValue);
            if (v[i] > maxValue) {
                maxValue = v[i];
            }
            if (prices[i] < minValue) {
                minValue = prices[i];
            }
        }
        return maxValue;
    }
 }