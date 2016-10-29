public class Solution {
    public boolean isPowerOfTwo(int n) {
                int i=n;
        if(n<1) return false;
        if(n==1)return true;
        while(i>1&&i%2==0){
        	i/=2;
        }
        if(i!=1) return false;
        else return true;
    }
}
