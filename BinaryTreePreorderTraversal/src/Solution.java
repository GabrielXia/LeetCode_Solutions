import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root==null)return result;
        traversal(root,result);
        return result;
    }
    public void traversal(TreeNode root, List<Integer> list){
    	list.add(root.val);
    	if(root.left==null&&root.right==null)return;
    	else if(root.left==null) traversal(root.right,list);
    	else if(root.right==null)traversal(root.left,list);
    	else{
    		traversal(root.left,list);
    		traversal(root.right,list);
    	}
    }
}
