import java.util.ArrayList;


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
	ArrayList<Integer> list= new ArrayList<Integer>();//need initialize
    public boolean isValidBST(TreeNode root) {
    	if(root==null)return true;
    	traversal(root);
    	for(int i=0;i<list.size()-1;i++){
    		if(list.get(i)>=list.get(i+1))return false;
    	}
    	return true;
       
    }
    public void traversal(TreeNode root){
        if(root==null)return;
    	if(root.left==null&&root.right==null)list.add(root.val);
    	else if(root.left==null){
    		list.add(root.val);
    		traversal(root.right);
    	}
    	else if(root.right==null){
    		traversal(root.left);
    		list.add(root.val);
    	}
    	else{
    		traversal(root.left);
    		list.add(root.val);
    		traversal(root.right);
    	}
    }
}