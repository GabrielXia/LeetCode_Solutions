//This solution is better than that for "Q53.MaximumSubarray"
public class Solution {
    public int maxProduct(int[] nums) {
        int size = nums.length;
        if(size==0)return 0;
        int[] maxF = new int[size];
        int[] minF = new int[size];
        maxF[0] = nums[0];
        int result = nums[0];
        minF[0] = nums[0];
        //1.about signal,2.where to start,3.where to end
        for(int i=1; i < size; i++){
        	maxF[i] =Math.max(Math.max(maxF[i-1]*nums[i],minF[i-1]*nums[i]), nums[i]);//where to start
        	minF[i] = Math.min(Math.min(minF[i-1]*nums[i], maxF[i-1]*nums[i]), nums[i]);//about the signal
        	result = Math.max(result,maxF[i]);
        }
        return result;
    }
}
