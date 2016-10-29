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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int size = inorder.length;
        if(size==0)return null;
        return buildTreeSecond(inorder,0,size-1,postorder,0,size-1);
    }
    public TreeNode buildTreeSecond(int[] inorder,int inorderStart,int inorderEnd,int[] postorder,int postorderStart,int postorderEnd){
    	int size = inorder.length;
    	int moyen=0,distanceFromStart;
    	TreeNode root = new TreeNode(postorder[postorderEnd]);
    	while(inorder[moyen]!=postorder[postorderEnd])moyen++;
    	distanceFromStart = moyen - inorderStart;
    	if(inorderStart==moyen&&inorderEnd==moyen){
    	}
    	else if(inorderStart==moyen){
    		root.right = buildTreeSecond(inorder,moyen+1,inorderEnd,postorder,postorderStart+distanceFromStart,postorderEnd-1);
    	}
    	else if(inorderEnd==moyen){
    		root.left = buildTreeSecond(inorder,inorderStart,moyen-1,postorder,postorderStart,postorderStart+distanceFromStart-1);
    	}
    	else{
    		root.left = buildTreeSecond(inorder,inorderStart,moyen-1,postorder,postorderStart,postorderStart+distanceFromStart-1);
    		root.right = buildTreeSecond(inorder,moyen+1,inorderEnd,postorder,postorderStart+distanceFromStart,postorderEnd-1);
    	}
    return root;
    
    
    }
}