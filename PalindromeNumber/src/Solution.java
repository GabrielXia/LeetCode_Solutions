
public class Solution {
	public boolean isPalindrome(int x) {
		int temp = x;
		int single,y=0;
		if(x<0) return false;
		if (x==0)return true;
		while(temp!=0){
			single = temp%10;
			y = 10*y+single;
			temp = temp /10;
		}
		if(x==y)return true;
		else return false;
    }
}
