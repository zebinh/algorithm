/**
 * 剑指Offer，把二叉树打印成多行
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeByLine {

    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (pRoot == null) {
            return result;
        }
        
        
        Queue<TreeNode> q = new LinkedList<>();

        int current = 1;
        int next = 0;

        q.offer(pRoot);
        ArrayList<Integer> line = new ArrayList<>();
        while ( !q.isEmpty() ) {
            TreeNode t = q.poll();
            line.add(t.val);
            current--;
            
            if (t.left != null) {
                q.offer(t.left);
                next++;
            }
            if (t.right != null) {
                q.offer(t.right);
                next++;
            }
            if (current == 0) {
                result.add(line);
                line = new ArrayList<>();
                current = next;
                next = 0;
            }
        }
        return result;
    }
    
}