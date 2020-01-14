import java.util.ArrayList;

/**
 * 剑指Offer，按之字形顺序打印二叉树
 */

 public class BinaryTreeZhiPrintSolution{

    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (pRoot == null) {
            return result;
        }

        int level = 1;
        ArrayList<TreeNode> currentLevel = new ArrayList<>();
        currentLevel.add(pRoot);
        
        while(currentLevel.size() != 0) {

            ArrayList<TreeNode> tmp = new ArrayList<>();
            ArrayList<Integer> valList = new ArrayList<>();

            if (level % 2 == 1) {
                
                for (TreeNode t : currentLevel) {
                    if (t.left != null) {
                        tmp.add(0, t.left);
                    }
                    if(t.right != null) {
                        tmp.add(0, t.right);
                    }
                    valList.add(t.val);
                }
            }else{
                for (TreeNode t : currentLevel) {
                    if (t.right != null) {
                        tmp.add(0, t.right);
                    }
                    if(t.left != null) {
                        tmp.add(0, t.left);
                    }
                    valList.add(t.val);
                }
            }
            level++;
            result.add(valList);
            currentLevel = tmp;
        }
        return result;
    }
 }