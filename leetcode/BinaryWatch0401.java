import java.util.ArrayList;
import java.util.List;

/**
 * 二进制手表
 */

 public class BinaryWatch0401{

    public static void main(String[] args) {
        readBinaryWatch(2);
    }

    // --------------
    public static int hm[] = {1, 2, 4, 8, 1, 2, 4, 8, 16, 32};
    public static int flag[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public static List<String> result = new ArrayList<>();

    public static List<String> readBinaryWatch(int num) {
        result = new ArrayList<>();
        backtrack(0, num);
        for (String s : result) {
            System.out.println(s);
        }
        return result;
    }

    private static void backtrack(int start, int num) {

        if (num <= 0) {
            int h = 0;
            int m = 0;
            for (int i = 0; i < hm.length; i++) {
                if (flag[i] != 0) {
                    continue;
                }
                if (i < 4) {
                    h += hm[i];
                }else {
                    m += hm[i];
                }
            }
            if (h < 12 && m < 60){
                result.add(String.format("%d:%02d", h, m));
            }
            return;
        }

        for (int i = start; i < hm.length; i++) {
            
            if (flag[i] == 1) {
                flag[i] = 0;
                backtrack(i+1, num-1);
                flag[i] = 1;
            }
        }
    }
    
 }