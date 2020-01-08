/**
 * 剑指Offer，字符流中第一个只出现一次的字符
 */

 public class FirstAppearanceOnceSolution {

    public String str = "";
    public int[] cnt  = new int[256];

    public void Insert(char ch)
    {
        str  += ch;
        cnt[ch]++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for (char c : str.toCharArray()) {
            if ( cnt[c] == 1) {
                return c;
            }
        }
        return '#';
    }
 }