import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
/**
 * LeetCode 2099 - Find Subsequence of Length K With the Largest Sum
 * 
 * This solution uses a priority queue to find the top K elements with the largest values
 * and then sorts them by their original indices to maintain the order in the subsequence.
 */ 
// @Author: creepjxVedant
// @Date: 2023-10-01
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{i, nums[i]});
        }

        List<int[]> topK = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topK.add(pq.poll());
        }

        topK.sort(Comparator.comparingInt(a -> a[0])); 

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = topK.get(i)[1];
        }

        return res;
    }
}