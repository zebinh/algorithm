/**
 * ��ָOffer�������������ĺ����������
 */

public class SequenceOfBST{

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length <= 0) {
            return false;
        }
        return isBST(sequence, 0, sequence.length-1);

    }

    public boolean isBST(int[] s, int start, int end) {
        if (start >= end) {
            return true;
        }
        int root = s[end];
        int i;
        for (i = start; i < end; i++) {
            if (s[i] > root) {
                break;
            }
        }

        for (int j = i; j < end; j++) {
            if (s[j] < root) {
                return false;
            }
        }
        return isBST(s, start, i-1) && isBST(s, i, end-1);
    }

}