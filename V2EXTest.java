/**
 * V2EX，V友题目
 * 
 *  题目：数组 a 分成 b 份形成一个二维数组（每个数组间元素个数方差最小），并且保证原数组的顺序不变，如
* [1,2,3,4,5,6,7] 分成 3 份则为，[[1,2],[3,4],[,5,6,7]] 或者[[1,2,3],[4,5],[6,7]] 两个答案都可以，只满足条件就行
*
* 思路：a.length / b为基本元素个数，a.length % b为多出来的个数，分配到n组内的某几组即可
 */

public class V2EXTest {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int b = 3;
        StringBuffer result = new StringBuffer();

        int index = 0;

        // a.length % b组每组为a.length / b + 1 个元素
        for (int i = 0; i < a.length % b; i++) {
            for (int j = 0; j < a.length / b + 1; j++) {
                result.append(a[index]);
                result.append(" ");
                index++;
            }
            result.append(",");
        }

        // 剩下的b - a.length % b组每组为a.length/b个元素
        for (int i = 0; i < b - a.length % b; i++) {
            for (int j = 0; j < a.length / b; j++) {
                result.append(a[index]);
                result.append(" ");
                index++;
            }
            result.append(",");
        }

        // 打印结果
        System.out.println(result.toString());
    }
}