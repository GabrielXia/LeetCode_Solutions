package Solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> triangle = new ArrayList<List<Integer> >();
    	for(int i=0;i<numRows;i++) triangle.add(new ArrayList<Integer>() );
    	if(numRows >=1) triangle.get(0).add(1);
    	if(numRows >=2) {triangle.get(1).add(1);triangle.get(1).add(1);}
    	if(numRows >2){
    		for(int j=2 ; j<numRows; j++){
    			triangle.get(j).add(1);
    			for(int k=1 ; k<j;k++){
    				triangle.get(j).add(triangle.get(j-1).get(k-1)+triangle.get(j-1).get(k));
    			}
    			triangle.get(j).add(1);
    		}
    	}
    	
    	return triangle;
    }
}
