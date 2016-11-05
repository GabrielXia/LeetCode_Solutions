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
	int result = 0;
    public int sumNumbers(TreeNode root) {
        if(root==null)return result;
        traversal(root,0);
        return result;
    }
    public void traversal(TreeNode root, int number){
    	if(root.left==null&&root.right==null)result+=10*number+root.val;
    	else if(root.left==null)traversal(root.right,10*number+root.val);
    	else if(root.right==null)traversal(root.left,10*number+root.val);
    	else{
    		traversal(root.left,10*number+root.val);
    		traversal(root.right,10*number+root.val);
    	}
    }
}
