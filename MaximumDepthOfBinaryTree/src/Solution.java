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
	private int max = 0;//it's a reference
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;//root = []
        root.val = 1;//root = [0]
        travel(root,1);
        return max;
        
        
    }
    //need to create a function to travel recursive
    public void travel(TreeNode node, int level){//make sure that function know levels
    	if(node.left==null&&node.right==null){
    		max = Math.max(max, node.val);
    		return;
    	}
    	else if(node.left==null){
    		node.right.val = level+1;
    		travel(node.right,level+1);
    	}
    	else if(node.right==null){
    		node.left.val = level+1;
    		travel(node.left,level+1);
    	}
    	else{
    		node.left.val = level+1;
    		travel(node.left,level+1);
    		node.right.val = level+1;
    		travel(node.right,level+1);
    	}
    	
    }
    
}
