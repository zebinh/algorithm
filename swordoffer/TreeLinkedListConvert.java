/**
 * 剑指Offer，二叉搜索树与双向链表
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class TreeLinkedListConvert {

    TreeNode head = null;
    TreeNode end = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        convertSub(pRootOfTree);
        return head;
    }

    public void convertSub(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return;
        }

        Convert(pRootOfTree.left);

        if (end == null) {
            head = pRootOfTree;
            end = pRootOfTree;
        }else {
            end.right = pRootOfTree;
            pRootOfTree.left = end;
            end = pRootOfTree;
        }

        Convert(pRootOfTree.right);
    }
}