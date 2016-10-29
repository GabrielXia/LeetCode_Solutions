package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums) ; 
        Integer j = 0;
        int k,w;
        List<List<Integer>> result =new ArrayList<List<Integer>>();
        HashMap<Integer,Integer> counter = new HashMap();
        HashMap< Integer,Integer> hashMap = new HashMap();
        //count
        for( int i:nums){
        	j = counter.put(i, 1);
        	if(j!=null) counter.put(i, j+1);
        }
        //if 3 numbers the same
        if(counter.containsKey(0)&&counter.get(0)>=3){
            //affectation to a reference affect all !!!
        	result.add(new ArrayList<Integer>() );
        	result.get(result.size()-1).add(0);
        	result.get(result.size()-1).add(0);
        	result.get(result.size()-1).add(0);
        }
        //if 2 numbers the same
        for(HashMap.Entry<Integer,Integer> entry:counter.entrySet()){
        	if(entry.getValue()>=2){
        		if(entry.getKey()==0)continue;
        		j = counter.get(-2*entry.getKey());
        		if(j!=null){
        			if(entry.getKey()<0){
        	        	result.add(new ArrayList<Integer>() );
        	        	result.get(result.size()-1).add(entry.getKey());
        	        	result.get(result.size()-1).add(entry.getKey());
        	        	result.get(result.size()-1).add(-2*entry.getKey());
        			}
        			else{
        	        	result.add(new ArrayList<Integer>() );
        	        	result.get(result.size()-1).add(-2*entry.getKey());
        	        	result.get(result.size()-1).add(entry.getKey());
        	        	result.get(result.size()-1).add(entry.getKey());
        			}
        			
        		}
        	}
        }
        for( k=0;k<nums.length;k++) hashMap.put(nums[k],k) ;
        for(HashMap.Entry<Integer,Integer> entry:hashMap.entrySet()){
        	for(HashMap.Entry<Integer,Integer> entry2:hashMap.entrySet()){
        		j = hashMap.get(-nums[entry.getValue()]-nums[entry2.getValue()]);
        		if(j!=null){
        			if(j>entry2.getValue()&&entry2.getValue()>entry.getValue()){
        				result.add(new ArrayList<Integer>() );
        	        	result.get(result.size()-1).add(nums[entry.getValue()]);
        	        	result.get(result.size()-1).add(nums[entry2.getValue()]);
        	        	result.get(result.size()-1).add(nums[j]);
        			}
        		}
        	}
        }

        return result;
    }
	
}
