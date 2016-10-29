/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
	public TreeLinkNode nodeBefore = null;//p is in the line higher than nodeBefore
	public TreeLinkNode firstNodeInLine =null;//p is in the same line with firstNodeLine
    public void connect(TreeLinkNode root) {
    	firstNodeInLine = root;
        if(root==null) return;
        root.next=null;
        if(root.left==null&&root.right==null)return;
        TreeLinkNode p =root;
        
        while(p!=null){ 	
        	if(p.left==null&&p.right==null);
        	else if(p.left==null){
        		if(nodeBefore==null)nodeBefore=p.right;
        		else {
        			nodeBefore.next = p.right;
        			nodeBefore = p.right;
        		}
        	}
        	else if(p.right==null){
        		if(nodeBefore==null)nodeBefore=p.left;
        		else{
        			nodeBefore.next = p.left;
        			nodeBefore = p.left;
        		}
        	}
            else{
                if(nodeBefore==null)nodeBefore=p.left;
                else nodeBefore.next = p.left;
            	p.left.next=p.right;
            	nodeBefore = p.right;	    	
            }
        	p=p.next;
        	if(p==null){
        		while(firstNodeInLine!=null&&firstNodeInLine.left==null&&firstNodeInLine.right==null) firstNodeInLine = firstNodeInLine.next;
        		if(firstNodeInLine==null)return;
        		if(firstNodeInLine.left!=null)firstNodeInLine = firstNodeInLine.left;
        		else firstNodeInLine = firstNodeInLine.right;
        		nodeBefore = null;
        		p = firstNodeInLine;	
        	}
       	}

    }
}