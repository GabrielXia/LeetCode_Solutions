public class Solution {
    public int uniquePaths(int m, int n) {
    	int[][] f = new int[m][n];
    	int i,j;
    	f[0][0] = 0;
    	if(m<1||n<1)return 0;
    	if(m<2||n<2)return 1;
    	for(i=1;i<m;i++)f[i][0] =1;
    	for(j=1;j<n;j++)f[0][j] = 1;
    	for(i=1;i<m;i++){
    		for(j=1;j<n;j++){
    			f[i][j] = f[i-1][j]+f[i][j-1];
    		}
    	}
    	return f[m-1][n-1];
    }
}
