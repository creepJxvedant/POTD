class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

       int n=fruits.length; 
       int count=0;

       for(int fruit:fruits){
         for(int j=0;j<n;j++){
            if(baskets[j]>=fruit){
               baskets[j]=0;
               fruit=0;
               break;
            }
         }
         if(fruit!=0)
          count++;

       }


     return count;
    }
}