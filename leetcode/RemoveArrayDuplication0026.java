
/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
* 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
*
* 解题思路：前后双指针i，j。如果两个指针的值相等，则j++，否则把i+1，j当前的值复制给i，i++即可
* 优化：j指针是明确的遍历了整个数组，使用for循环要优雅一些
 */
class RemoveArrayDuplication0026 {

    public static int removeDuplicates(int[] nums) {
    
        if (nums == null && nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1;  j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                continue;
            }
            i++;
            nums[i] = nums[j];
        }
        // System.out.println(i+1);
        return i + 1;
    }

    public static void main(String[] args) {
        int tmp[] = {1, 2,  4, 4, 4, 5, 6, 7, 7, 8, 9};
        removeDuplicates(tmp);
    }
}