/**
 * 剑指Offer，对称的二叉树
 */


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class SymmetricalSolution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) {
            return true;
        }
        return symmetrical(pRoot.left, pRoot.right);
    }

    public boolean symmetrical(TreeNode aTree, TreeNode bTree) {
        if (aTree == null && bTree == null) {
            return true;
        }
        
        if ( (aTree != null && bTree == null) || (aTree == null && bTree != null) ) {
            return false;
        }

        if (aTree.val != bTree.val) {
            return false;
        }

        return symmetrical(aTree.left, bTree.right) && symmetrical(aTree.right, bTree.left);
    }
}