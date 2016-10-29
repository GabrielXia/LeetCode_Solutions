/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        int length = getLength(head);
        return sortedListToBST(head,length);
    }
    public int getLength(ListNode head){
    	int length= 0;
    	while(head!=null){
    		head = head.next;
    		length++;
    	}
    	return length;
    }
    public int getValue(ListNode head, int n){//get value in the n case
    	for(int i=0;i<n;i++){
    		head = head.next;
    	}
    	return head.val;
    }
    public TreeNode sortedListToBST(ListNode head,int length){
    	if(length<=0)return null;
    	int middle = length/2;
    	ListNode afterMiddle =head;
    	for(int i=0;i<=middle;i++)afterMiddle = afterMiddle.next;
    	TreeNode root = new TreeNode(getValue(head,middle));
    	root.left = sortedListToBST(head,middle);
    	root.right = sortedListToBST(afterMiddle,length-middle-1);
    	return root;
    }
}
