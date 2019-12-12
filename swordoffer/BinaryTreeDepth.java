/**
 * 剑指Offer，树的深度
 */

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class BinaryTreeDepth {
    
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftTreeDepth = TreeDepth(root.left);
        int rightTreeDepth = TreeDepth(root.right);
        if (leftTreeDepth > rightTreeDepth) {
            return leftTreeDepth + 1;
        }else {
            return rightTreeDepth + 1;
        }
    }
}