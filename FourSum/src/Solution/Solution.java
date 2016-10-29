package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int left, right,judge=0;
        for(int i=0;i<nums.length-3;i++){
        	for(int j=i+1; j<nums.length-2;j++){
        		left = j+1;
        		right = nums.length-1;
        		while(left<right){
        			if(nums[i]+nums[j]+nums[left]+nums[right]==target){
        				for(List<Integer> elementResult:result){
        					if(elementResult.get(0)==nums[i]&&elementResult.get(1)==nums[j]&&elementResult.get(2)==nums[left]&&elementResult.get(3)==nums[right]){
        						judge=1;
        					}
        				}
        				if(judge==1)judge=0;
        				else{
        					result.add(new ArrayList<Integer>());
        					result.get(result.size()-1).add(nums[i]);
        					result.get(result.size()-1).add(nums[j]);
        					result.get(result.size()-1).add(nums[left]);
        					result.get(result.size()-1).add(nums[right]);
        				}
        				left++;
        				right--;
        			}
        			else if(nums[i]+nums[j]+nums[left]+nums[right]<target)left++;
        			else right--;
        			
        		}
        	}
        }
        return result;
    }
}
