/**
 * 剑指Offer，平衡二叉树
 */

 public class IsBalanceTree{


    public boolean IsBalanced_Solution(TreeNode root) {
        
        if (depth(root) == -1){
            return false;
        }
        return true;
    }

    public static int depth(TreeNode root){
        if (root == null) {
            return 0;
        }

        int l = depth(root.left);
        if (l == -1) {
            return -1;
        }
        int r = depth(root.right);
        if (r == -1) {
            return -1;
        }

        if (Math.abs(l - r) > 1) {
            return -1;
        }

        return Math.max(l, r) + 1;
    }
 }