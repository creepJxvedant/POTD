import java.util.Arrays;
class Solution {
        int mod=(int)1e9+7;
    public int numberOfWays(int n, int x) {
     int num[]=new int[n+1];
        int dp[][]=new int[n+1][n+1];
        
        for(int d[]:dp)Arrays.fill(d,-1);

        

        for(int i=1;i<=n+1;i++){
          num[i-1]=(int)Math.pow(i,x);
        }

    return knapSack(num.length-1,num,n,dp);
    }

    int knapSack(int idx,int arr[],int value,int dp[][]){
        if(value==0)
           return 1;

        if(value<0 || idx<0)
          return 0;

          if(dp[idx][value]!=-1) return dp[idx][value];
           
        
        
        long take=knapSack(idx-1,arr,value-arr[idx],dp);

        long nottake=knapSack(idx-1,arr,value,dp);
       dp[idx][value]=(int)((take+nottake)%mod);
        

    return dp[idx][value];
    }
   }
