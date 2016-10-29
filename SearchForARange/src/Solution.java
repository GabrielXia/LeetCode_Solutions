
public class Solution {
    public int[] searchRange(int[] nums, int target) {
               int size = nums.length;
       int left = 0,right = size-1,moyen;
       int[] result = new int[2];
       result[0] = -1;
       result[1] = -1;
       
       if(target < nums[0]||target>nums[right]) return result;
       else{
    	   while(left<right){
    		   moyen = (left+right)/2;
    		   if(nums[moyen]<target)left = moyen+1;
    		   else right = moyen;
    	   }
    	   if(nums[left]==target) result[0] = left;//important, always needed
    	   else return result;
    	   
    	   left = 0;
    	   right = size-1;
    	   while(left<right){
    		   moyen = (left+right)/2;
    		   if(nums[moyen]>target)right =moyen;
    		   else left = moyen+1;
    	   }
    	   if(nums[left]==target) result[1] = left;//
    	   else result[1] = left-1;
       }
       return result;
    }
}