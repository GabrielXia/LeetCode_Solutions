public class Solution {
    public int maxProfit(int[] prices) {
    	int size = prices.length;
    	if(size<2)return 0;
    	
    	int[][] f = new int[2][size];
    	//for one transaction
    	f[0][0] = 0;
    	int priceMin = prices[0];
    	for(int i=1; i<size;i++){
    		f[0][i] = Math.max(f[0][i-1], prices[i]-priceMin);
    		priceMin = Math.min(priceMin, prices[i]);
    	}
    	if(size<4)return f[0][size-1];
    	
    	//for the second transaction
    	int secondBuyAmountMax = f[0][2] - prices[2];//secondBuyAmountMax is for remember the biggest profit after second buy
    	for(int i=0;i<3;i++)f[1][i]=f[0][i];
    	for(int i=3;i<size;i++){
    		f[1][i] = Math.max(f[1][i-1], prices[i]+secondBuyAmountMax);//depend whether item i is used
    		secondBuyAmountMax = Math.max(secondBuyAmountMax, f[0][i]-prices[i]);
    	}
    	return f[1][size-1];
    	
    }
}
