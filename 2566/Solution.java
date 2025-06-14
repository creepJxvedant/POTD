class Solution {


  
  public static void main(String[] args) {
  int num=11891;

  System.out.println(new Solution().minMaxDifference(num));
  
}

    public int minMaxDifference(int num) {
       
       int minToReplace=firstMin(num);
       int maxToReplace=firstMax(num);

       return Math.abs(reconstruct(num,minToReplace,true)-reconstruct(num,maxToReplace,false));
    }
 int reconstruct(int num,int digit,boolean max){
     int ans=0;
     int pow=1;
     
     while(num>0){
      int d=num%10;
      if(d==digit)
       d=max?9:0;

    ans+=d*pow;
    pow*=10;
    num/=10;
     }

return ans;
    }


    int firstMin(int num){
     int digit=-1;
     
     while(num>0){
      int d=num%10;
      if(d!=9)
       digit=d;

    num/=10;
     }


return digit;
    }

    int firstMax(int num){
     int digit=-1;
     
     while(num>0){
      int d=num%10;
      if(d!=0)
       digit=d;

    num/=10;
     }


return digit;
    }

}