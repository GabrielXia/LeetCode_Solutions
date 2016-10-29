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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int size = preorder.length;
        if(size==0) return null;
        
        return buildTreeSecond(preorder,0,size-1,inorder,0,size-1);
    }
    public TreeNode buildTreeSecond(int[] preorder, int preorderStart,int preorderEnd,int[] inorder,int inorderStart,int inorderEnd){
    	int moyen=0,distance;
    	TreeNode root = new TreeNode(preorder[preorderStart]);
    	while(inorder[moyen]!=preorder[preorderStart])moyen++;
    	distance = moyen - inorderStart;
    	if(moyen==inorderStart&&moyen==inorderEnd){
    		return root;
    	}
    	else if(moyen==inorderStart){
    		root.right = buildTreeSecond(preorder,preorderStart+distance+1,preorderEnd,inorder,moyen+1,inorderEnd);

    	}
    	else if(moyen==inorderEnd){
    		root.left = buildTreeSecond(preorder,preorderStart+1,preorderStart+distance,inorder,inorderStart,moyen-1);
    	}
    	else{
    		root.left = buildTreeSecond(preorder,preorderStart+1,preorderStart+distance,inorder,inorderStart,moyen-1);
    		root.right = buildTreeSecond(preorder,preorderStart+distance+1,preorderEnd,inorder,moyen+1,inorderEnd);
    	}
    return root;	
    }
}