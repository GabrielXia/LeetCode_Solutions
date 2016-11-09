public class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        if(size==0)return 0;
        int[] f = new int[size];
        int sum = 0;
        if(nums[0]>0){
        	f[0] = nums[0];
        	sum = nums[0];
        }
        else f[0]=nums[0];
        for(int i = 1;i < size; i++){
        	sum += nums[i];
        	f[i] = Math.max(f[i-1], sum);//f[i+1] = max(f[i],f[i]+nums[i+1])
        	if(sum<0)sum = 0;//if sum<0, set it to 0
        }
        return f[size-1];
    }
}