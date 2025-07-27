package setMatrixZero;
class Solution {
    public void setMatrixZeroes(int[][] mat) {
    
    int n=mat.length;
    int m=mat[0].length;
        boolean row[]=new boolean[n];
        boolean col[]=new boolean[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                 row[i]=true;
                  col[j]=true;
                }
                 
            }
        }
        
      for(int i=0;i<n;i++){
          if(row[i]){
              for(int j=0;j<m;j++)
               mat[i][j]=0;
          }
      }
      
      
      for(int i=0;i<m;i++){
          if(col[i]){
              for(int j=0;j<n;j++)
               mat[j][i]=0;
          }
      
        
    }
}
}