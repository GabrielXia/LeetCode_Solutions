public class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int left = 0, right = size-1, moyen;
        if(target <= nums[0])return 0;
        else if(target > nums[size-1]) return size;
        while(left<right){
        	moyen = (left+right)/2;
        	if(target<nums[moyen]) right = moyen;
        	else if(target>nums[moyen])left = moyen+1;
        	else return moyen;
        }
        return left;
    }
}