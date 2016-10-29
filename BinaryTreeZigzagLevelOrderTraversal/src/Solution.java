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
	int height = 0;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null)return result;
        getHeight(root,0);
        for(int i =0;i<=height;i++)result.add(new ArrayList<Integer>());
        traversal(root,0,result);
        for(int i =2;i<=height;i = i+2)swap(result.get(i));
        return result;
        
    }
    
    public void swap(List<Integer> line){
    	int size = line.size();
    	int temp = 0;
    	for(int i=0;i<size/2;i++){
    		temp = line.get(size - 1 - i);
    		line.set(size - 1-i, line.get(i));
    		line.set(i, temp);
    	}
    }
    
    public void getHeight(TreeNode root,int level){
    	if(root.left==null&&root.right==null){
    		height = Math.max(height, level);
    		return;
    	}
    	else if(root.left==null){
    		getHeight(root.right,level+1);
    	}
    	else if(root.right==null){
    		getHeight(root.left,level+1);
    	}
    	else{
    		getHeight(root.left,level+1);
    		getHeight(root.right,level+1);
    	}
    }
    public void traversal(TreeNode root,int level,List<List<Integer>> list){
    	if(root.left==null&&root.right==null){
    		list.get(level).add(root.val);
    		return;
    	}
    	else if(root.left==null){
    		list.get(level).add(root.val);
    		traversal(root.right,level+1,list);
    	}
    	else if(root.right==null){
    		list.get(level).add(root.val);
    		traversal(root.left,level+1,list);
    	}
    	else{
    	    list.get(level).add(root.val);
    		traversal(root.left,level+1,list);
    		traversal(root.right,level+1,list);
    	}
    }
    
}