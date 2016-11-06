public class Solution {
    public int maxProfit(int k, int[] prices) {
        int size = prices.length;
        if(size<2)return 0;
        if(k<1)return 0;
        
        int[][] f = new int[k][size];
        f[0][0] = 0;
        int priceMin = prices[0];
        int nTimesBuyAmount;
        int i,j;
        for(i=1;i<size;i++){
        	f[0][i] = Math.max(f[0][i-1], prices[i]-priceMin);
        	priceMin = Math.min(priceMin, prices[i]);
        }
        
        for(i = 1;i < k ;i++){
        	if(2*i>=size) return f[i-1][size-1];
        	for(j = 0;j<=2*i;j++)f[i][j] = f[i-1][j];
        	nTimesBuyAmount = f[i-1][2*i] - prices[2*i];
        	for(j = 2*i+1; j<size;j++){
        		f[i][j] = Math.max(f[i][j-1], prices[j]+nTimesBuyAmount);
        		nTimesBuyAmount = Math.max(nTimesBuyAmount,f[i-1][j]-prices[j]);
        	}
        }
        return f[k-1][size-1];
    }
}