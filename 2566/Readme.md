# 2566. Maximum Difference by Remapping a Digit

**Difficulty:** Easy  
**Accuracy:** 63.3% 
**Submissions:** /54.1K 
---

Bob is being sneaky! He takes a number and remaps **exactly one digit** to another digit (from 0 to 9), **replacing all its occurrences**. Your task is to return the **difference between the maximum and minimum** numbers he can create after such a remapping.

---

## Notes

- Bob can remap digit `d1` to digit `d2`, where `0 ≤ d1, d2 ≤ 9`.
- **All** occurrences of `d1` in `num` are replaced.
- He can remap a digit to itself (i.e., make no change).
- The resulting number may contain leading zeroes.
- Different digits may be chosen for maximizing and minimizing the value.

---

## Examples

### Example 1

Input: num = 11891
Output: 99009

```
Explanation:
To maximize → remap digit 1 → 9 → 99899
To minimize → remap digit 1 → 0 → 890
Difference = 99899 - 890 = 99009

```

### Example 2

Input: num = 90
Output: 99

```
Explanation:
Max: Replace 0 with 9 → 99
Min: Replace 9 with 0 → 0
Difference = 99 - 0 = 99
```

---

## Constraints

- `1 ≤ num ≤ 10^8`

---

## Tags

Greedy, Math, String Manipulation