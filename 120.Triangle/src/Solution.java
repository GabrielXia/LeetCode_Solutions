import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int lineNumber = triangle.size();
        if(lineNumber==0)return 0;
        Integer[] result = new Integer[lineNumber];
        result[0] = triangle.get(0).get(0);
        for(int i=1;i<lineNumber;i++){
        	result[i] = result[i-1]+ triangle.get(i).get(i);
        	for(int j=i-1;j>0;j--){
        		result[j] = Math.min(result[j], result[j-1])+triangle.get(i).get(j);
        	}
        	result[0] = result[0]+triangle.get(i).get(0);
        }
        return (int)Collections.min(Arrays.asList(result) );//the min in a table!!
    }
}
