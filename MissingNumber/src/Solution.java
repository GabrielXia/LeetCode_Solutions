public class Solution {
	public int missingNumber(int[] nums) {
        int size = nums.length,sumNums=0,sumIdea=0;
        for(int i=0;i<=size;i++)sumIdea^=i;
        for(int i=0;i<size;i++)sumNums^=nums[i];
        
        return sumIdea^sumNums;
        
    }
}
