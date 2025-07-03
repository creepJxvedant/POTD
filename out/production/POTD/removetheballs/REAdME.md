# Remove the Balls

**Difficulty:** Medium  
**Accuracy:** 58.66%  
**Submissions:** 29K+  
**Points:** 4

You are given two arrays, `color` and `radius`, representing a sequence of balls:

- `color[i]` is the color of the *i*-th ball.
- `radius[i]` is the radius of the *i*-th ball.

If two **consecutive** balls have the same color and radius, remove them both. Repeat this process until no more such pairs exist.

Return the number of balls remaining after all possible removals.

---

## Examples

**Example 1**

```
Input:    color  = [2, 3, 5]
          radius = [3, 3, 5]
Output:   3

Explanation: All three balls have different colors or radii, so none are removed.
```

**Example 2**

```
Input:    color  = [2, 2, 5]
          radius = [3, 3, 5]
Output:   1

Explanation: The first and second balls have the same color (2) and radius (3), so they are removed. Only one ball remains.
```

---

## Constraints

- `1 ≤ color.size() = radius.size() ≤ 10^5`
- `1 ≤ color[i] ≤ 10^9`
- `1 ≤ radius[i] ≤ 10^9`