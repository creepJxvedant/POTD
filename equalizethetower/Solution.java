class Solution {
    public int minCost(int[] heights, int[] cost) {
        
        int min=heights[0];
        int max=heights[0];
        int costValue=Integer.MAX_VALUE;
        
        for(int h:heights){
            min=Math.min(min,h);
            max=Math.max(max,h);
        }
        
        while(min<=max){
            
        int mid=(max+min)/2;
        
        int cost1=costCalculate(mid,cost,heights);
        int cost2=costCalculate(mid+1,cost,heights);
        
        if(cost1<cost2){
            max=mid-1;
        }else{
            min=mid+1;
        }
            
        costValue=Math.min(costValue,Math.min(cost1,cost2));
        }
    
        return costValue;
    }
    
    
    int costCalculate(int target,int cost[],int heights[]){
        int costValue=0;
        
        for(int i=0;i<heights.length;i++){
            costValue=costValue+Math.abs(heights[i]-target)*cost[i];
        }
        
        
        return costValue;
    }
}
