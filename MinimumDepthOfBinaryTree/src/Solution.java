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
    public int minDepth(TreeNode root) {
    	if(root==null)return 0;
    	root.val = 1;
    	travel(root,1);
    	return (int) min;
    
    }
    public void travel(TreeNode root,int level){
    	if(root.left==null&&root.right==null){
    		min = Math.min(min, root.val);
    		return;
    	}
    	else if(root.left==null){
    		root.right.val = level+1;
    		travel(root.right,level+1);
    	}
    	else if(root.right==null){
    		root.left.val = level+1;
    		travel(root.left,level+1);
    	}
    	else{
    		root.right.val = level+1;
    		travel(root.right,level+1);
    		root.left.val = level+1;
    		travel(root.left,level+1);
    	}
    }
    public double min = Double.POSITIVE_INFINITY;;
}
