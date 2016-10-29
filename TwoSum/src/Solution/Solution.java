package Solution;
import java.util.HashMap;

public  class Solution {
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        int aim,i;
        Integer k = null;//Integer can be use to set value null
        for(i=0; i<nums.length; i++) hashMap.put(nums[i],i);
        for(i=0; i<nums.length; i++){
        	aim = target - nums[i];
        	k = hashMap.get(aim);
        	//if(k!=i) can cause nullexpectationerror because k can be null
        	if(k!=null && k!=i) break;
    
        	
        }
        int[] result = {0,0};
        if(i<=k){
        	result[0] = i;
        	result[1] = k;
        }
        else{
        	result[0] =k;
        	result[1] =i;
        }
        return result;
    }
}
