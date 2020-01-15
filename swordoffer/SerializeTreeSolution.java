/**
 * 剑指Offer，序列化二叉树
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class SerializeTreeSolution {

    int index = -1;

    String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }

        return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
    }

    TreeNode Deserialize(String str) {
        String[] s = str.split(",");
        index++;

        if (index > s.length) {
            return null;
        }

        TreeNode node = null;
        if ( !"#".equals(s[index]) ) {
            node = new TreeNode(Integer.valueOf(s[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }

        return node;
    }
}