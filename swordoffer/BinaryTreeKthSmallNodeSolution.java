/**
 * 剑指Offer，二叉搜索树的第K个节点
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class BinaryTreeKthSmallNodeSolution {

    int index = 0;
    TreeNode resultNode = null;

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot == null || k <= 0)  {
            return null;
        }
        findKthSamll(pRoot, k);
        return resultNode;
    }

    public void  findKthSamll(TreeNode node, int k) {

        if (node.left != null) {
            findKthSamll(node.left, k);
        }
        
        index++;
        if (index == k) {
            resultNode = node;
        }

        if(node.right != null) {
            findKthSamll(node.right, k);
        }

    }
}