package Solution;

public class Solution {
	 public static int[] plusOne(int[] digits) {
		 int c=1,sum ;
		 for(int i = digits.length-1; i >=0; i--){
			 sum =digits[i] + c;
			 digits[i] = sum %10;
			 c = sum / 10;
		 }
		 if (c==0) return digits;
		 else{
			 int[] result = new int[digits.length+1];
			 for( int i=digits.length-1; i>=0; i--){
				 result[i+1] = digits [i];
			 }
			 result[0] = 1;
			 return result;
		 }
	 }
}
