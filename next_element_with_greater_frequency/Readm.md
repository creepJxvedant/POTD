# 📊 Next Element with Greater Frequency

**Difficulty:** Medium  
**Accuracy:** 60.4%  
**Submissions:** 16K+  
**Points:** 4

---

## 🧩 Problem Statement

Given an array `arr[]` of integers, for each element, find the **closest element to its right** that has a **higher frequency** (number of total occurrences in the array) than the current element.

If no such element exists, return `-1` for that position.

---

## 📥 Input

- An integer array `arr[]` of size `n` where:
  - `1 ≤ arr.length ≤ 10⁵`
  - `1 ≤ arr[i] ≤ 10⁵`

---

## 📤 Output

- Return an array of the same size where:
  - Each element is replaced with the **next element to its right** having a **greater frequency**.
  - If no such element exists, return `-1` at that index.

---

## 📌 Examples

### Example 1:

**Input:**  
```  
arr = [2, 1, 1, 3, 2, 1]
```  
**Output:**  
```
[1, -1, -1, 2, 1, -1]
```

**Explanation:**  
- Frequencies:  
  - `1 → 3 times`  
  - `2 → 2 times`  
  - `3 → 1 time`  
- `arr[0] = 2`: next is `1` (higher freq) → `1`  
- `arr[1] = 1`: no higher freq to the right → `-1`  
- `arr[2] = 1`: same as above → `-1`  
- `arr[3] = 3`: next is `2` (freq 2 > 1) → `2`  
- `arr[4] = 2`: next is `1` (freq 3 > 2) → `1`  
- `arr[5] = 1`: no elements to right → `-1`  

---

### Example 2:

**Input:**  
```
arr = [5, 1, 5, 6, 6]
```  
**Output:**  
```
[-1, 5, -1, -1, -1]
```

**Explanation:**  
- Frequencies:  
  - `5 → 2 times`  
  - `6 → 2 times`  
  - `1 → 1 time`  
- Only `arr[1] = 1` has a higher freq element to the right: `5`

---

## 🔧 Constraints

- `1 ≤ arr.length ≤ 10⁵`  
- `1 ≤ arr[i] ≤ 10⁵`

---

## 💡 Approach (Hint)

1. Count the frequency of each element using a hashmap.
2. Traverse the array from **right to left** while maintaining a stack.
3. For each element:
   - Pop elements from the stack whose frequency is **less than or equal** to the current's.
   - If the stack is not empty, the top element is the answer.
   - Push the current element onto the stack.
4. Return the result array.

---

## ✅ Tags

`Stack` &nbsp; `Frequency Count` &nbsp; `HashMap` &nbsp; `Monotonic Stack`

---