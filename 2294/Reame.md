# 2294. Partition Array Such That Maximum Difference Is K

You are given an integer array `nums` and an integer `k`. You may partition `nums` into one or more subsequences such that each element in `nums` appears in exactly one of the subsequences.

Return the minimum number of subsequences needed such that the difference between the maximum and minimum values in each subsequence is at most `k`.

A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

---

**Example 1:**  
Input: nums = [3,6,1,2,5], k = 2  
Output: 2  
Explanation: We can partition nums into [3,1,2] and [6,5]. The differences are 2 and 1 respectively.

**Example 2:**  
Input: nums = [1,2,3], k = 1  
Output: 2  
Explanation: We can partition nums into [1,2] and [3] or [1] and [2,3].

**Example 3:**  
Input: nums = [2,2,4,5], k = 0  
Output: 3  
Explanation: We can partition into [2,2], [4], and [5].

---

**Constraints:**  
- 1 <= nums.length <= 10⁵  
- 0 <= nums[i] <= 10⁵  
- 0 <= k <= 10⁵  

---
