# Group Balls by Sequence

**Difficulty:** Medium  
**Accuracy:** 41.62%  
**Submissions:** 9K+  
**Points:** 4

---

## Problem Statement

You are given an array `arr[]` of positive integers, where each element `arr[i]` represents the number written on the i-th ball, and a positive integer `k`.

Your task is to determine whether it is possible to rearrange all the balls into groups such that:

- Each group contains exactly `k` balls.
- The numbers in each group are **consecutive integers**.

---

## Examples

### Example 1:
**Input:**  
`arr[] = [10, 1, 2, 11]`, `k = 2`  
**Output:**  
`true`  

**Explanation:**  
The array can be rearranged as `[1, 2]` and `[10, 11]`.  
There are two groups of size `2`, and each group contains consecutive numbers.

---

### Example 2:
**Input:**  
`arr[] = [7, 8, 9, 10, 11]`, `k = 2`  
**Output:**  
`false`  

**Explanation:**  
There are `5` elements and grouping them into sets of `2` is not possible (as 5 is not divisible by 2).

---

## Constraints

- `1 ≤ arr.length ≤ 10^6`  
- `0 ≤ arr[i] ≤ 10^5`  
- `1 ≤ k ≤ 10^3`  

---

## Notes

- This problem tests your ability to use greedy strategies and efficient data structures like heaps or TreeMaps.
- Sorting and counting frequencies efficiently is key to solving this within time limits.

---

## Tags

`Greedy` `Sorting` `Hashing` `Heap` `Multiset` `Frequency Count`

