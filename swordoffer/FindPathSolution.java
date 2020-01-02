/**
 * 剑指Offer，二叉树中和为某一值的路径
 */

import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class FindPathSolution {

    public List<Integer> tmp = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        
        if (root == null) {
            if (target == 0) {
                result.add(new ArrayList(tmp));
                return new ArrayList<>();
            }else{
                return result;
            }
        }

        tmp.add(root.val);
        FindPath(root.left, target - root.val);
        
        if (root.right != null) {
            FindPath(root.right, target - root.val);
        }
        tmp.remove(tmp.size() - 1);
        
        return  result;
    }
}