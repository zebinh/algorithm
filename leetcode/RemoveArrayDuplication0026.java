
/**
 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
* ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
*
* ����˼·��ǰ��˫ָ��i��j���������ָ���ֵ��ȣ���j++�������i+1��j��ǰ��ֵ���Ƹ�i��i++����
* �Ż���jָ������ȷ�ı������������飬ʹ��forѭ��Ҫ����һЩ
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