/**
 * ��ָOffer����ʾ��ֵ���ַ���
 */
public class IsNumericSolution {

    public static void main(String[] args) {
        System.out.println(isNumeric("123".toCharArray()));
    }

    public static boolean isNumeric(char[] str) {
        
        boolean point = false, exp = false; // ��־С�����ָ��
 
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '+' || str[i] == '-') {
                if (i + 1 == str.length || !(str[i + 1] >= '0' && str[i + 1] <= '9' || str[i + 1] == '.')) { // +-�ź���ض�Ϊ���� �� ����Ϊ.��-.123 = -0.123��
                    return false;
                }
                if (!(i == 0 || str[i-1] == 'e' || str[i-1] == 'E')) { // +-��ֻ�����ڵ�һλ��eE�ĺ�һλ
                    return false;
                }
 
 
            } else if (str[i] == '.') {
                if (point || exp || !(i + 1 < str.length && str[i + 1] >= '0' && str[i + 1] <= '9')) { // .����ض�Ϊ���� ��Ϊ���һλ��233. = 233.0��
                    return false;
                }
                point = true;
 
            } else if (str[i] == 'e' || str[i] == 'E') {
                if (exp || i + 1 == str.length || !(str[i + 1] >= '0' && str[i + 1] <= '9' || str[i + 1] == '+' || str[i + 1] == '-')) { // eE����ض�Ϊ���ֻ�+-��
                    return false;
                }
                exp = true;
 
            } else if (str[i] >= '0' && str[i] <= '9') {
 
 
            } else {
                return false;
            }
 
        }
        return true;
    }
}