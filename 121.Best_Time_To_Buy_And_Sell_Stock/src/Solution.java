public class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int priceMinimal,profilMaximal = 0;
        if(size<2)return 0;
        priceMinimal  = prices[0];
        profilMaximal = Math.max(0,prices[1]-prices[0]);
        for(int i = 1; i<size ; i++){//O(n)
        	priceMinimal = Math.min(priceMinimal, prices[i]);//note the price minimal!!
        	profilMaximal = Math.max(profilMaximal, prices[i]-priceMinimal);
        }
        return profilMaximal;
    }
}
