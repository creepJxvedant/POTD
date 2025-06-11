package removetheballs;
import java.util.Stack; 
class Solution {

    public static void main(String[] args) {
        int color[] = {1,2, 2,1}, radius[] = {1,2,2,1};
      
        System.out.println(new Solution().findLength(color, radius));   
    }

    public int findLength(int[] color, int[] radius) {
        if(color.length<=1)
          return color.length;
         
        Stack<int[]> stack = new Stack<>();

        for(int i=0;i<color.length;i++){
            if(!stack.isEmpty() && (stack.peek()[0]==color[i] && stack.peek()[1]==radius[i])){
                stack.pop();
                continue;
            }
            stack.push(new int[]{color[i],radius[i]});
        }

         
        

         return stack.size();
    }
}