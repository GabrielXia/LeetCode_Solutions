public class Solution {
    public int climbStairs(int n) {
        int[] waysTo = new int[n];
        if(n==0)return 0;
        waysTo[0] = 1;
        if(n==1)return 1;
        waysTo[1] = 2;
        for(int i=2;i<n;i++){
        	waysTo[i] = waysTo[i-1] + waysTo[i-2];
        }
        return waysTo[n-1];
    }
}
