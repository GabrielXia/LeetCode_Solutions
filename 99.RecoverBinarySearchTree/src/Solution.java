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
    public void recoverTree(TreeNode root) {
    	//use morris traversal,example[6,2,7,1,4,#,9,#,#,3,5,#,#,8,#]
    	TreeNode cur=root;
    	TreeNode prev;
    	TreeNode firstWrong=null,secondWrong=null;//note two wrong node
    	TreeNode preNode=null;//note prenode before current node
    	boolean found=false;
    	while(cur!=null){
    		if(cur.left==null){
    			if(preNode==null)preNode = cur;
    			else{
    				if(cur.val>preNode.val)preNode=cur;
    				else{
    					if(!found){
    						firstWrong = preNode;
    						secondWrong = cur;//in case that two wrong node are next to each other
    						found = true;
    					}
    					else secondWrong = cur;
    					preNode = cur;//update preNode every time
    				}
    			}
    			cur = cur.right;
    		}
    		else{
    			prev = cur.left;
    			while(prev.right!=null&&prev.right!=cur)prev = prev.right;
    			if(prev.right==null){
    				prev.right=cur;
    				cur = cur.left;
    			}
    			else{
    				if(cur.val>preNode.val)preNode=cur;
    				else{
    					if(!found){
    						firstWrong = preNode;
    						secondWrong = cur;
    						found=true;
    					}
    					else secondWrong = cur;
    					preNode = cur;
    				cur= cur.right;
    				}
    			}
    		}
    	}
    	int temp = firstWrong.val;
    	firstWrong.val = secondWrong.val;
    	secondWrong.val = temp;
  }
}
/*
public void traversalMorris(TreeNode root){
	TreeNode cur=root;
	TreeNode prev;
	while(cur!=null){
		if(cur.left==null){
			System.out.print(cur.val);
			cur = cur.right;
		}
		else{
			prev = cur.left;
			while(prev.right!=null&&prev.right!=cur)prev = prev.right;
			if(prev.right==null){
				prev.right=cur;
				cur = cur.left;
			}
			else{
				prev.right=null;
				System.out.print(cur.val);
				cur= cur.right;
			}
		}
	}
}
*/
