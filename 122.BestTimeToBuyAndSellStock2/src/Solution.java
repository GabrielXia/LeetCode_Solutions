public class Solution {
    public int maxProfit(int[] prices) {
        int profil = 0;
        int size = prices.length;
        if(size<2)return profil;
        for(int i=0;i<size-1;i++){
        	if(prices[i+1]>prices[i]){
        		profil+=prices[i+1]-prices[i];
        	}
        }
        return profil;
    }
}
