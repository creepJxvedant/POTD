import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;


class Solution {
    public ArrayList<Integer> findGreater(int[] arr) {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int num:arr)
         map.put(num,map.getOrDefault(num,0)+1);
        
        
        
        for(int i=arr.length-1;i>=0;i--){
            int num=arr[i];
            
            while(!st.isEmpty() && map.get(st.peek())<=map.get(num)){
                st.pop();
            }
            
            
            ans.add(st.isEmpty()?-1:st.peek());
            st.push(num);
        }
        
        
        Collections.reverse(ans);
        
        
        return ans;
    }
}