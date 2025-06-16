# Equalize the Towers

## 🧩 Problem Statement

You are given two arrays:

- `heights[]`: representing the height of each tower  
- `cost[]`: where `cost[i]` is the cost to increase or decrease tower `i` by 1 unit  

Your task is to make all towers the **same height** by either **adding or removing blocks**. The cost to modify a tower's height by 1 unit is `cost[i]`.  
Return the **minimum total cost** required to equalize the heights of all towers.

---

## 🔍 Examples

### Example 1
```
Input: heights = [1, 2, 3], cost = [10, 100, 1000]
Output: 120
```

### Example 2

```
Input: heights = [7, 1, 5], cost = [1, 1, 1]
Output: 6
```

---

## ✅ Constraints

- `1 ≤ heights.length == cost.length ≤ 10⁵`  
- `1 ≤ heights[i] ≤ 10⁴`  
- `1 ≤ cost[i] ≤ 10³`

---

## ⏱️ Expected Complexity

- **Time Complexity**: `O(n * log(max(heights[i])))`  
- **Auxiliary Space**: `O(1)`

---

## 🏷️ Tags

- Greedy  
- Binary Search  
- Convex Optimization
