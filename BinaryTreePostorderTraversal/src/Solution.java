import java.util.ArrayList;
import java.util.List;
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root==null)return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root,head =null;//is there more intersting way to initial temp
        stack.push(root);
        while(!stack.isEmpty()){
        	head = stack.peek();
        	if(temp==head.left||temp==head.right){
        		result.add(head.val);
        		temp = head;
        		stack.pop();
        	}
        	else{
        		if(head.left==null&&head.right==null){
        			result.add(head.val);
            		temp = head;
            		stack.pop();
        		}
        		else if(head.left==null){
        			stack.push(head.right);
        		}
        		else if(head.right==null){
        			stack.push(head.left);	
        		}
        		else{
        			stack.push(head.right);
        			stack.push(head.left);
        		}
        	}
        }
        return result;
    }
    
    
}
