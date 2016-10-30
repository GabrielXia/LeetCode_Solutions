import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	if(hashmap.containsKey(nums[i])){
        		result.add(nums[i]);
        	}
        	else{
        		hashmap.put(nums[i],i);
        	}
        }
        return result;
    }
}
