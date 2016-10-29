
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
	boolean result = true;
	public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        compareSymmetric(root.left,root.right);//compare leftnode and rightnode
        return result;
    }
	public void compareSymmetric(TreeNode leftRoot,TreeNode rightRoot){
	    if(leftRoot ==null&&rightRoot==null)return;
	    else if(leftRoot==null||rightRoot==null){
	        result = false;
	        return;
	    }
	    else{
	        if(leftRoot.val!=rightRoot.val){
			result = false;
			return;
		    }
		    if(leftRoot ==null)return;
		    compareSymmetric(leftRoot.left,rightRoot.right);
	    	compareSymmetric(leftRoot.right,rightRoot.left);
	        }

	}
}
