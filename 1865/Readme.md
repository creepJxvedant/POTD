# 🧮 LeetCode 1865: Finding Pairs With a Certain Sum

## 📘 Problem Statement

Design a data structure that supports two operations on two integer arrays `nums1` and `nums2`:

- `add(index, val)`: Add `val` to `nums2[index]`.
- `count(tot)`: Return the number of pairs `(i, j)` such that `nums1[i] + nums2[j] == tot`.

You are to implement the `FindSumPairs` class:

```java
class FindSumPairs {
    FindSumPairs(int[] nums1, int[] nums2)
    void add(int index, int val)
    int count(int tot)
}
```

---

## 🧾 Constructor and Methods

### 🔹 `FindSumPairs(int[] nums1, int[] nums2)`
Initializes the object with the integer arrays `nums1` and `nums2`.

### 🔹 `void add(int index, int val)`
Adds the value `val` to `nums2[index]`.

### 🔹 `int count(int tot)`
Returns the number of pairs `(i, j)` such that `nums1[i] + nums2[j] == tot`.

---

## 🧪 Example

```text
Input:
["FindSumPairs", "count", "add", "count", "count", "add", "add", "count"]
[[[1,1,2,2,2,3], [1,4,5,2,5,4]], [7], [3,2], [8], [4], [0,1], [1,1], [7]]

Output:
[null, 8, null, 2, 1, null, null, 11]
```

### Explanation:

- `findSumPairs.count(7)`  
  ➤ Returns 8; valid pairs: (2,2), (3,2), (4,2), (2,4), (3,4), (4,4), (5,1), (5,5)

- `findSumPairs.add(3, 2)`  
  ➤ Now `nums2 = [1, 4, 5, 4, 5, 4]`

- `findSumPairs.count(8)`  
  ➤ Returns 2; valid pairs: (5,2), (5,4)

- `findSumPairs.count(4)`  
  ➤ Returns 1; valid pair: (5,0)

- `findSumPairs.add(0, 1)`  
  ➤ Now `nums2 = [2, 4, 5, 4, 5, 4]`

- `findSumPairs.add(1, 1)`  
  ➤ Now `nums2 = [2, 5, 5, 4, 5, 4]`

- `findSumPairs.count(7)`  
  ➤ Returns 11; valid pairs include all combinations of nums1[i] + nums2[j] == 7

---

## 📊 Constraints

- `1 <= nums1.length <= 1000`
- `1 <= nums2.length <= 10⁵`
- `1 <= nums1[i], nums2[i] <= 10⁹`
- `0 <= index < nums2.length`
- `1 <= val <= 10⁵`
- `1 <= tot <= 10⁹`
- At most `1000` calls to `add` and `1000` calls to `count`.

---

## ⚙️ Complexity Notes

Since `nums1` is small (≤1000) but `nums2` can be large (up to 10⁵), the optimal approach is:

- Maintain a frequency map (e.g., `HashMap<Integer, Integer>`) of `nums2` values.
- Update this map on each `add()` call.
- Use this map to quickly compute `count()` in `O(len(nums1))` time.

---

## 🏷️ Tags

- Hash Map
- Design
- Data Structures

---

