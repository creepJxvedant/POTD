import java.util.*;

class Solution {
    public boolean validgroup(int[] arr, int k) {
        if (arr.length % k != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        while (!map.isEmpty()) {
            int start = map.firstKey();
            for (int i = 0; i < k; i++) {
                int num = start + i;
                if (!map.containsKey(num)) return false;

                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0) {
                    map.remove(num);
                }
            }
        }

        return true;
    }
}
