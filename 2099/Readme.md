
# 2099. Find Subsequence of Length K With the Largest Sum

## 🟢 Difficulty: Easy  
**Tags**: Array, Hash Table, Sorting, Heap (Priority Queue)

---

## 🧩 Problem Statement

You are given an integer array `nums` and an integer `k`. You want to find a **subsequence** of `nums` of length `k` that has the **largest sum**.

Return _any such subsequence_ as an integer array of length `k`.

> A **subsequence** is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

---

## ✏️ Examples

### Example 1:
```
Input: nums = [2,1,3,3], k = 2  
Output: [3,3]  
Explanation: The subsequence has the largest sum of 3 + 3 = 6.
```

### Example 2:
```
Input: nums = [-1,-2,3,4], k = 3  
Output: [-1,3,4]  
Explanation: The subsequence has the largest sum of -1 + 3 + 4 = 6.
```

### Example 3:
```
Input: nums = [3,4,3,3], k = 2  
Output: [3,4]  
Explanation: The subsequence has the largest sum of 3 + 4 = 7.
Other valid answers: [4,3]
```

---

## ✅ Constraints
- `1 <= nums.length <= 1000`
- `-10⁵ <= nums[i] <= 10⁵`
- `1 <= k <= nums.length`

---

## 🧠 Approach

To find a subsequence of length `k` with the **largest sum** while **preserving the original order**:
1. Create a list of pairs `(index, value)` for each element in `nums`.
2. Sort the list based on values in descending order.
3. Take the top `k` elements.
4. Sort these `k` elements based on their original indices to preserve order.
5. Return the values of these elements.

### 💡 Techniques Used
- Priority Queue (Heap)
- Greedy
- Sorting
- Index tracking to maintain subsequence order

---

## 📊 Stats
- **Acceptance Rate**: 47.5%
- **Total Submissions**: ~158.9K
- **Accepted Solutions**: ~75.4K

---
