/**
 * 剑指offer：翻转单词顺序列
 */

 public class ReverseWordSequence{

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(ReverseSentence(s));
    }

    public static String ReverseSentence(String str) {
        if (str == null || str.length() <=0) {
            return str;
        }
        
        // 整体反转
        char[] charArray = str.toCharArray();
        reverseWord(charArray, 0, charArray.length-1);   

        // 单个单词反转
        int i= 0, j =0;
        while (true) {
            if (j >= charArray.length) {
                reverseWord(charArray, i, j-1);
                break;
            }

            if (charArray[j] != ' ') {
                j++;
                continue;
            }
            reverseWord(charArray, i, j - 1);
            j++;
            i = j;
        }

        return new String(charArray);
    }

    public static void reverseWord(char[] charArray, int start, int end){

        for (int i = start, j = end; i < j; i++, j--) {
            char tmp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = tmp;
        }
    }
 }

