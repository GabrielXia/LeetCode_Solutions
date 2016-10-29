
	public class Solution {
	    public int findPeakElement(int[] nums) {
	        int left = 0, right = nums.length-1, moyen;
	        if(nums.length==1) return 0;
	        if(nums[0]>nums[1]) return 0;
	        else if(nums[right]>nums[right-1])return right;
	        else{
	        	while(left<right){
	        		moyen = (left+right)/2;
	        		if(nums[moyen]>nums[moyen-1]&&nums[moyen]>nums[moyen+1]) return moyen;
	        		else if(nums[moyen] > nums[moyen-1] &&nums[moyen+1]>nums[moyen]) left = moyen+1;
	        		else right = moyen;
	        	}
	        	return left;
	        }
	    }
	}