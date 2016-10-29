package Solution;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left,right,sumClost,sumStandard,distanceTemporel;
        int distanceMin = Math.abs(target - nums[0]-nums[nums.length-1]-nums[1]);
        sumClost = nums[0] + nums[nums.length-1]+nums[1];
        for(int i=0; i<nums.length-2; i++){
        	sumStandard = target - nums[i];
        	left = i+1;
        	right = nums.length-1;
        	distanceTemporel = Math.abs(sumStandard-nums[left]-nums[right]);
        	if(distanceTemporel<distanceMin){
        		distanceMin = distanceTemporel ; 
        		sumClost = nums[i]+nums[left]+nums[right];
        	}
        	while(left<right){
        		if(nums[left]+nums[right] < sumStandard){
        			left++;
        		}
        		else{
        			right--;
        		}
        		if(left!=right){
        			distanceTemporel = Math.abs(sumStandard-nums[left]-nums[right]);
        			if(distanceTemporel<distanceMin){
        				distanceMin = distanceTemporel ; 
            			sumClost = nums[i]+nums[left]+nums[right];
            		}
            	}
        	}
        }
        return sumClost;
    }
}
