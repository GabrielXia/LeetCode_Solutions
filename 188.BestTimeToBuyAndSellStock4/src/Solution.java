public class Solution {
	//to economy memory, use a table instead of a matrix
    public int maxProfit(int k, int[] prices) {
        int size = prices.length;
        if(size<2)return 0;
        if(k<1)return 0;
        
        int[] f = new int[size];
        f[0] = 0;
        int priceMin = prices[0];
        int nTimesBuyAmount;
        int i,j;
        int tmp;
        for(i=1;i<size;i++){
        	f[i] = Math.max(f[i-1], prices[i]-priceMin);
        	priceMin = Math.min(priceMin, prices[i]);
        }
        
        for(i = 1;i < k ;i++){
        	if(2*i>=size) return f[size-1];
        	
        	nTimesBuyAmount = f[2*i] - prices[2*i];
        	for(j = 2*i+1; j<size;j++){
        		tmp = f[j];//tmp to remember the f[j] before changed, that is f[j] for j-1 transaction
        		f[j] = Math.max(f[j-1], prices[j]+nTimesBuyAmount);
        		nTimesBuyAmount = Math.max(nTimesBuyAmount,tmp-prices[j]);
        	}
        }
        return f[size-1];
    }
}