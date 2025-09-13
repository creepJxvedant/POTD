# 3541. Find Most Frequent Vowel and Consonant

You are given a string `s` consisting of lowercase English letters (`'a'` to `'z'`).

Your task is to:

1. Find the vowel (`'a', 'e', 'i', 'o', 'u'`) with the maximum frequency.
2. Find the consonant (all other letters excluding vowels) with the maximum frequency.
3. Return the **sum of the two frequencies**.

If multiple vowels or consonants have the same maximum frequency, you may choose any one of them.  
If there are no vowels or no consonants in the string, consider their frequency as **0**.

The **frequency of a letter** is the number of times it occurs in the string.

---

## Examples

### Example 1:
**Input:**
```
s = "successes"
```

**Output:**
```
6
```

**Explanation:**
- Vowels → 'u' (1), 'e' (2) → max = 2  
- Consonants → 's' (4), 'c' (2) → max = 4  
- Answer = 2 + 4 = 6

---

### Example 2:
**Input:**
```
s = "aeiaeia"
```

**Output:**
```
3
```

**Explanation:**
- Vowels → 'a' (3), 'e' (2), 'i' (2) → max = 3  
- Consonants → none → max = 0  
- Answer = 3 + 0 = 3

---

## Constraints
- 1 <= s.length <= 100
- s consists of lowercase English letters only.

---

## Approach
1. Count frequency of all characters using a hashmap or array of size 26.
2. Track the maximum frequency among vowels.
3. Track the maximum frequency among consonants.
4. Return their sum.


## Complexity Analysis
- **Time Complexity:** O(n) where n = len(s) (one pass to count + one pass to check max).  
- **Space Complexity:** O(1) (at most 26 letters stored).
