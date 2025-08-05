# 🍎 LeetCode 3477 - Fruits Into Baskets II

**Difficulty**: Easy  
**Acceptance Rate**: 66.6%

## 🧩 Problem Description

You are given two arrays of integers: `fruits` and `baskets`, both of length `n`:

- `fruits[i]` represents the quantity of the *i-th* type of fruit.
- `baskets[j]` represents the capacity of the *j-th* basket.

Place the fruits from left to right, following these rules:

1. Each fruit type must be placed in the **leftmost available basket** with a capacity **greater than or equal** to the fruit’s quantity.
2. Each basket can hold only **one type** of fruit.
3. If a fruit type cannot be placed in any basket, it remains **unplaced**.

### 🧮 Return

The number of fruit types that remain unplaced after all possible allocations.

---

## 📥 Examples

### Example 1
**Input:**
```
fruits = [4, 2, 5]
baskets = [3, 5, 4]
```

**Output:**
```
1
```

### Example 2
**Input:**
```
fruits = [3, 6, 1]
baskets = [6, 4, 7]
```

**Output:**
```
0
```

---

## 🔒 Constraints

- `n == fruits.length == baskets.length`
- `1 <= n <= 100`
- `1 <= fruits[i], baskets[i] <= 1000`

---

## 🏢 Companies Asked

> This problem has been asked in interviews and is common in screening rounds for companies testing basic array processing and greedy logic.

---

## 🧠 Tags

- Arrays
- Greedy
- Simulation