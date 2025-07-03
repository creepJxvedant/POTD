# Find the K-th Character in String Game I

**Problem Link:** [LeetCode 3304](https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/)

## Description

Alice and Bob are playing a game. Initially, Alice has a string `word = "a"`.

You are given a positive integer `k`.

Now Bob will ask Alice to perform the following operation **forever**:

> Generate a new string by changing each character in `word` to its **next character** in the English alphabet, and **append** it to the original `word`.

- For example:
  - "c" becomes "cd"
  - "zb" becomes "zbac" (since 'z' → 'a', and 'b' → 'c')

Return the value of the **k-th character** in the final string, after performing the operation enough times to ensure the string has at least `k` characters.

⚠️ Note: 'z' wraps around to 'a'.

---

## Examples

### Example 1:

**Input:**  
`k = 5`  
**Output:**  
`"b"`

**Explanation:**  
- "a" → "ab" → "abbc" → "abbcbccd"

### Example 2:

**Input:**  
`k = 10`  
**Output:**  
`"c"`

---

## Constraints

- `1 <= k <= 500`

---
