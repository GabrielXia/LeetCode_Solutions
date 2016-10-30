import java.util.Stack;


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
    public void flatten(TreeNode root) {
    	if(root==null)return;
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode temp;
    	stack.add(root);
    	while(!stack.isEmpty()){//can we use reccursive way?
    		temp = stack.pop();
    		if(temp.left==null&&temp.right==null);
    		else if(temp.left==null)stack.add(temp.right);
    		else if(temp.right==null)stack.add(temp.left);
    		else{
    			stack.add(temp.right);
    			stack.add(temp.left);
    		}
    		if(!stack.isEmpty()){
    			temp.left=null;
    			temp.right = stack.peek();
    		}
    		
    	}
    }
}