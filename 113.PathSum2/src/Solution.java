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
	List<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        result = new ArrayList<List<Integer>>();
        if(root==null)return result;
        ArrayList<Integer> oneSolution = new ArrayList<Integer>();
        DFS(oneSolution,root,sum);
        return result;
    }
    public void DFS(ArrayList<Integer> oneSolution,TreeNode root,int sum){
    	if(root.left==null&&root.right==null){
    		if(root.val==sum){
    			oneSolution.add(root.val);
    			result.add(oneSolution);
    		}
    	}
    	else if(root.left==null){
    		oneSolution.add(root.val);
    		DFS((ArrayList<Integer>)oneSolution.clone(), root.right, sum-root.val);//clown to put instance not reference
    		
    	}
    	else if(root.right==null){
    		oneSolution.add(root.val);
    		DFS((ArrayList<Integer>)oneSolution.clone(),root.left,sum-root.val);
    	}
    	else{
    		oneSolution.add(root.val);
    		DFS((ArrayList<Integer>)oneSolution.clone(),root.left,sum-root.val);
    		DFS((ArrayList<Integer>)oneSolution.clone(),root.right,sum-root.val);
    	}
    }
}
