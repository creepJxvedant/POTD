import java.util.Arrays;

public class Solution {

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        
        int n=players.length;
        int m=trainers.length;
        int p=0;
        int t=0;
        int count=0;

        while(p<n && t<m){
       
       if(players[p]<=trainers[t]){
         count++;
         p++;
        }

     t++;
        }
        
    return count;
    }
}