public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int sizeX = matrix.length;
        if(sizeX==0)return false;
        int sizeY = matrix[0].length;
        int line,moyenLine,up,down,left,right,moyen;
        
        //find line
        if(target<matrix[0][0]) return false;
        if(target>=matrix[sizeX-1][0]) line = sizeX-1;
        else{
            up = 0;
            down = sizeX-1;
            while(down>up){
        	    moyenLine = (up+down)/2;
            	if(target<matrix[moyenLine][0]) down = moyenLine;
            	else if(target>matrix[moyenLine][0]) up = moyenLine+1;
            	else return true;
            }
            if(target ==matrix[up][0]) return true;
            else if(sizeX>1)line = down-1;
            else line =0;
        }
        if(target>matrix[line][sizeY-1]) return false;
        left = 0;
        right = sizeY-1;
        while(left<right){
        	moyen = (left+right)/2;
        	if(target<matrix[line][moyen]) right = moyen;
        	else if(target>matrix[line][moyen]) left = moyen+1;
        	else return true;
        	
        }
        if(sizeY==1&&target==matrix[line][0])return true;
        else if(target==matrix[line][left]) return true;
        else return false;
    }
}
