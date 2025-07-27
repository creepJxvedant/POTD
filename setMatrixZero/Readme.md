# Set Matrix Zeros

**Difficulty**: Medium  
**Accuracy**: 52.54%  
**Submissions**: 47K+  
**Points**: 4

---

## Problem Statement

You are given a 2D matrix `mat[][]` of size `n x m`. Your task is to modify the matrix in-place such that **if any element `mat[i][j]` is `0`, then all elements in the `i`-th row and `j`-th column are set to `0`.

---

## 🔍 Examples

### Example 1:

**Input:**
```
mat = [
 [1, 2, 3],
 [4, 0, 6],
 [7, 8, 9]
]
```

**Output:**
```
[
 [1, 0, 3],
 [0, 0, 0],
 [7, 0, 9]
]
```

**Explanation:** `mat[1][1] = 0`, so the entire 1st row and 1st column are set to `0`.

---

### Example 2:

**Input:**
```
mat = [
 [0, 2, 3, 0],
 [4, 5, 6, 7],
 [8, 9, 10, 11]
]
```

**Output:**
```
[
 [0, 0, 0, 0],
 [0, 5, 6, 0],
 [0, 9, 10, 0]
]
```

**Explanation:** `mat[0][0]` and `mat[0][3]` are `0`, so row 0, column 0, and column 3 are all set to `0`.

---

## ✅ Constraints

- `1 ≤ n, m ≤ 500`
- `-2^31 ≤ mat[i][j] ≤ 2^31 - 1`

---

## 💡 Approach

1. **First Pass:** Identify rows and columns that need to be zeroed using auxiliary space or in-place markers.
2. **Second Pass:** Update the matrix accordingly.
3. Optimize space by using first row and column as markers if needed.

---

## 🛠 Languages Used

- Java (or any other language you’ve implemented it in)

---

## 📁 How to Run

```bash
# Compile
javac Solution.java

# Run
java Solution
```

> Replace filenames according to your environment and language.

---

## 📌 Notes

- Be cautious with in-place modifications to avoid cascading zero effects.
- Try to reduce space complexity if asked in interviews.

---

