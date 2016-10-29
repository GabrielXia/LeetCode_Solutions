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
    public TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;
        return sortedArrayToBST(nums,0,length-1);
    }
    public TreeNode sortedArrayToBST(int[] nums,int start,int end){
    	if(start>end)return null;
    	int middle = (start+end)/2;
    	TreeNode root = new TreeNode(nums[middle]);
    	root.left = sortedArrayToBST(nums,start,middle-1);
    	root.right = sortedArrayToBST(nums,middle+1,end);
    	return root;
    }
}
