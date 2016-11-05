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
	List<String> result = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
    	if(root==null)return null;
    	traversal(root,null);
        return result;
    }
    public void traversal(TreeNode root,String path){
    	if(root.left==null&&root.right==null){
    		if(path==null){
    			result.add((String)root.val);
    		}
    		else{
    			result.add(path+"->"+root.val);
    		}
    	}
    	else if(root.left==null){
    		if(path==null)traversal(root.right,root.val);
    		else traversal(root.right,path+"->"+root.val);
    	}
    	else if(root.right==null){
    		if(path==null)traversal(root.left,root.val);
    		else traversal(root.left,path+"->"+root.val);
    	}
    	else{
    		if(path==null){
    			traversal(root.left,root.val);
    			traversal(root.right,root.val);
    		}
    		else{
    		traversal(root.right,path+"->"+root.val);
    		traversal(root.right,path+"->"+root.val);
    		}
    	}
    	
    }
}