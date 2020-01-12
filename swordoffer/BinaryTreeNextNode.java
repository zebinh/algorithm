/**
 * 剑指Offer，二叉树的下一个结点
 */

 
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeNextNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right != null) {
            TreeLinkNode rightNode = pNode.right;
            while (rightNode.left != null) {
                rightNode = rightNode.left;
            }
            return rightNode;
        }

        if (pNode.next != null && pNode.next.left == pNode) {
            return pNode.next;
        }

        if (pNode.next != null) {
            TreeLinkNode parentNode = pNode.next;
            while (parentNode.next != null && parentNode.next.right == parentNode) {
                parentNode = parentNode.next;
            }
            return parentNode.next;
        }
        return null;
    }
}