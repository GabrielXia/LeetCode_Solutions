package Solution;
public class Solution {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length==0) return 0;
        int large = nums[0];
        int j = 1,k =1 ;
        for(int i=1; i<length ; i++){
            if(nums[i]==large) {
            	k++;
            	continue;
            }
            if(k==1){
            	nums[j++] = nums[i];
            	large = nums[i];
            }
            else if(k>=2){
            	nums[j++] = large;
            	nums[j++] = nums[i];
            	large = nums[i];
            	k=1;
            }
        }
        if(k>=2){
        	nums[j++]=nums[length-1];
        }

        return j;
    }
}