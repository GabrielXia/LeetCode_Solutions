import java.util.Stack;

class Solution {
	public int largestRectangleArea(int[] heights) {
        int size = heights.length,i=0,surface=0,leftEdge,rightEdge,heightForOne;
        Stack<Integer> stack = new Stack<Integer>();
        //add 0 at the last to make sure that we calculate all surface
        int[] newHeights = new int[size+1];
        for(int j=0;j<size;j++)newHeights[j] =heights[j];
        newHeights[size] = 0;
        
        while(i<size+1){
        	if(stack.isEmpty()||newHeights[i]>newHeights[stack.peek()]){
        		stack.push(i);
        		i++;
        	}
        	else{
        		heightForOne = newHeights[stack.peek()];
        		stack.pop();
        		if(stack.isEmpty())surface = Math.max(surface, heightForOne*(i));//that's to say all numbers before are smaller
        		else{
        			leftEdge = stack.peek();
        			rightEdge = i;
        			surface =  Math.max(surface,heightForOne*(rightEdge-leftEdge-1));
        		}
        	}
        }
        
        
     return surface;   
    }
}
