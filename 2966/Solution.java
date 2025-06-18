package lc;
import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        int nums[]={33,26,4,18,16,24,24,15,8,18,34,20,24,16,3}, k = 16;
        
        for(int a[]:new Solution().divideArray(nums,k)){
            System.out.println(Arrays.toString(a));
        }

    }
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length/3;
        
        if(!isPossible(nums,k))
          return new int[0][0];

        int ans[][]=new int[n][3];
        
        for(int j=0;j<n;j++){
        int startIdx=3*j;
        for(int i=0;i<3;i++){
         ans[j][i]=nums[startIdx+i];
        }
        }

return ans;
    }
    boolean isPossible(int nums[],int k){
        
        for(int j=0;j<nums.length;j+=3){
        int first=nums[j];
        int last=nums[j+2];
        if(last-first>k)
            return false;

        }
 return true;
    }
}