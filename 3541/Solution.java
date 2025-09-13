
class Solution {
    public int maxFreqSum(String s) {
     int count[]=new int[26];
     for(char c:s.toCharArray()) count[c-'a']++;

     int v=0,c=0;
     
     for(int i=0;i<26;i++){
         if(i==0 || i==4 || i==8 || i==14 || i==20)
           v=Math.max(v,count[i]);
        else c=Math.max(c,count[i]);

     }


    return v+c;
    }
}