
public class GreatestSumOfSubArray {

    public static void main(String[] args) {
        int[] array = {6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(array));
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        
        int maxSum = Integer.MIN_VALUE;
        int maxHere = 0;
        for (int i = 0; i < array.length; i++) {
            
            if (maxHere < 0) {
                maxHere = array[i];
            }else{
                maxHere += array[i];
            }

            if (maxHere > maxSum) {
                maxSum = maxHere;
            }
        }
        return maxSum;
    }
}

