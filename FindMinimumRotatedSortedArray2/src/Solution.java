public class Solution {
	public int findMin(int[] nums) {
		int left=0,right = nums.length-1, moyen,minimal;
		
        while(true){
        	if(right-left==2){
        		if(nums[left]<nums[left+1]) minimal = Math.min(nums[left], nums[right]);
        		else minimal = Math.min(nums[left+1], nums[right]);
        		break;
        	}
        	else if(right-left==1){
        		minimal = Math.min(nums[left], nums[right]);
        		break;
        	}
        	else if(right==left){
        		minimal = nums[left];
        		break;
        	}
        	else{
        		moyen = (left + right)/2;}
            	if(nums[left]>nums[moyen])right = moyen;
            	else if(nums[right]<nums[moyen+1])left = moyen+1;
            	else if(nums[left]==nums[moyen]&&nums[moyen+1]==nums[right])left ++;//10,1,10,10,10
            	else{
            		minimal = Math.min(nums[left], nums[moyen+1]);
            		break;
            	}
        	}
        
        return minimal;
    }
}
