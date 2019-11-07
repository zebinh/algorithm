/**
 * leetcode³ýÊý²©ÞÄ
 */

 public class DivisorGame1025{

    public static void main(String[] args) {
        System.out.println(divisorGame(100));
    }

    public  static boolean divisorGame(int N) {
        
        boolean r[] = new boolean[N];
        for (int i = 0; i <N ; i++) {
            r[i] = false;
            if (i == 0){
                r[i] = false;
                continue;
            }else if(i == 1) {
                r[i] = true;
                continue;
            }
            for (int j =1; j < (i+1)/2; j++) {
                if ((i+1) % j == 0) {
                    if(!r[i-j]){
                        r[i] = true;
                        break;
                    }
                }
            }

        }
        return r[N-1];
    }
 }