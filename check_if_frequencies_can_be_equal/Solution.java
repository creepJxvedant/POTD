import java.util.Map.Entry;
import java.util.TreeMap;
class Solution {
    boolean sameFreq(String s) {
        
        int f[]=new int[26];
        for(char ch:s.toCharArray())
          f[ch-'a']++;
         
          TreeMap<Integer,Integer> map=new TreeMap<>();
          for(int i=0;i<26;i++){
              if(f[i]==0)
               continue;
               
              map.put(f[i],map.getOrDefault(f[i],0)+1);
             if(map.size()>2)
              return false;
          }
          
          if(map.size()<=1)
            return true;

           Entry<Integer,Integer> first=map.firstEntry();
           Entry<Integer,Integer> second=map.lastEntry();
           
           if(first.getValue()> 1 && second.getValue()>1) {
               return false;
           }

           if(first.getValue() == 1 && (first.getKey()-1 == 0 || first.getKey()-1 == second.getKey())) {
               return true;
           }
           
           
           if(second.getValue() == 1 && (second.getKey()-1 == 0 || second.getKey()-1 == first.getKey())) {
               return true;
           }

           
        return false;
    }
}