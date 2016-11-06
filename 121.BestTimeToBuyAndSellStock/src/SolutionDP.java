//Solution question "121" in a dynamic programming way
public class SolutionDP {
	 public int maxProfit(int[] prices) {
	        int size = prices.length;
	        if(size<2)return 0;
	        int[] f = new int[size];//f[i] is the optimal solution for prices[:i]
	        f[0] = 0;
	        int priceMin = prices[0];
	        for(int i=1; i<size; i++){
	        	f[i] = Math.max(f[i-1], prices[i]-priceMin);//depend on whether we use item i
	        	priceMin = Math.min(priceMin, prices[i]);
	        }
	        return f[size-1];
	    }
}
