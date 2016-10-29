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
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<Integer>();
        if(root==null)return result;
        traversal(root,result);
        return result;
    }
    public void traversal(TreeNode root, List<Integer> list){
    	if(root.left==null&&root.right==null){
    		list.add(root.val);
    	}
    	else if(root.left==null) {
    		list.add(root.val);
    		traversal(root.right,list);
    	}
    	else if(root.right==null){
    		traversal(root.left,list);
    		list.add(root.val);
    	}
    	else{
    		traversal(root.left,list);
    		list.add(root.val);
    		traversal(root.right,list);
    	}
    }
}