/**
 * 剑指Offer，从上到下打印二叉树
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;
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
public class PrintFromTopToBottomBinaryTree {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            result.add(node.val);
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }
        }

        return result;

    }
}