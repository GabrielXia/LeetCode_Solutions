package Solution;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
       ArrayList<Integer> triangle = new ArrayList<Integer>();
       if(rowIndex==0) return triangle;
       for(int i=0; i<rowIndex; i++)triangle.add(0);
       triangle.set(0,1);
       if(rowIndex==1) return triangle;
       for(int i=0; i<rowIndex; i++){
    	   for(int j=rowIndex-1; j>0 ; j--){
    		   triangle.set(j,triangle.get(j)+triangle.get(j-1));
    	   	   }
    	   
           }
       return triangle;
       }
}