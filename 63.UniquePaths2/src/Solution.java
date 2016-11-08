public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int sizeY = obstacleGrid.length;
        if(sizeY<1)return 0;
        int sizeX = obstacleGrid[0].length;
        if(sizeX<1)return 0;
        
        int x,y;
        
        int[][] f = new int[sizeY][sizeX];
        x=0;
        while(x<sizeX&&obstacleGrid[0][x]==0){
        	f[0][x] = 1;
        	x++;
        }
        while(x<sizeX){
        	f[0][x] = 0;
        	x++;
        }
        y=0;
        while(y<sizeY&&obstacleGrid[y][0]==0){
        	f[y][0] = 1;
        	y++;
        }
        while(y<sizeY){
        	f[y][0] = 0;
        	y++;
        }
        for(x=1;x<sizeX;x++){
        	for(y=1;y<sizeY;y++){
        		if(obstacleGrid[y][x]==0){
        			f[y][x] = f[y-1][x]+f[y][x-1];
        		}
        		else f[y][x] = 0;
        	}
        }
        return f[sizeY-1][sizeX-1];
    }
}
