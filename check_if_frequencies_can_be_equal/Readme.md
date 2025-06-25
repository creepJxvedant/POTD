# Check if Frequencies Can Be Equal

**Difficulty:** Medium  
**Accuracy:** 16.67%  
**Submissions:** 122K+  
**Points:** 4  

---

## 📘 Problem Statement

Given a string `s` consisting only of lowercase alphabetic characters, determine whether it is possible to **remove at most one character** such that the **frequency of each distinct character in the string becomes equal**.

Return `true` if it is possible, otherwise `false`.

---

## 🔍 Examples

### Example 1:
Input: s = "xyyz"
Output: true
Explanation: Removing one 'y' will make the frequency of all characters equal to 1.


### Example 2:
Input: s = "xyyzz"
Output: true
Explanation: Removing one 'x' will make frequency of each character equal to 2.


### Example 3:
Input: s = "xxxxyyzz"
Output: false
Explanation: No single removal can equalize all frequencies.

---

## 📌 Constraints

- `1 ≤ s.length ≤ 10⁵`
- All characters are lowercase English letters.

---