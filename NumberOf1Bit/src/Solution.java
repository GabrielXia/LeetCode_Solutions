public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	int number = 0;
    	int i = n&0x0FFFFFFFF;
        while(i>0){
        	number+=i&1;
        	i=i>>1;
        	}
        return number;
    }
}
