import java.util.Arrays;
class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int low = 0;
        int high=0;
        for (int i = 1; i < nums.length; i++) {
            high = Math.max(high, nums[i] - nums[i - 1]);
        }
        
        int ans = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canForm(nums, p, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean canForm(int[] nums, int p, int maxDiff) {
        int count = 0;
        int i = 1;
        while (i < nums.length) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                count++;
                i += 2; 
            } else {
                i++;
            }
        }
        return count >= p;
    }
}
