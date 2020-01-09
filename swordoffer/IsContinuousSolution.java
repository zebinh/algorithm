import java.util.TreeSet;

/**
 * ½£Ö¸Offer£¬ÆË¿ËÅÆË³×Ó
 */

 public class IsContinuousSolution {

    public boolean isContinuous(int [] numbers) {
        if (numbers.length != 5) {
            return false;
        }

        int zeroCnt = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < numbers.length; i++) {
    
            if ( numbers[i] == 0 ) {
                zeroCnt++;
            } else {
                set.add(numbers[i]);
            }
        }

        if (set.size() + zeroCnt == 5 && set.last() - set.first() < 5) {
            return true;
        }

        return false;
    }
 }