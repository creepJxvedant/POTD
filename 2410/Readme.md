
# Leetcode 2410. Maximum Matching of Players With Trainers

## 🧠 Problem Statement

You are given two integer arrays:

- `players[i]` – ability of the `i`-th player
- `trainers[j]` – capacity of the `j`-th trainer

Each player can be matched with **at most one trainer**, and each trainer with **at most one player**, only if:
```
players[i] <= trainers[j]
```

Return the **maximum number of matchings**.

---

## 🧩 Examples

### Example 1:
**Input:**
```text
players = [4, 7, 9]
trainers = [8, 2, 5, 8]
```

**Output:** `2`

**Explanation:**
- Player with skill 4 → Trainer with capacity 8
- Player with skill 7 → Trainer with capacity 8

### Example 2:
**Input:**
```text
players = [1, 1, 1]
trainers = [10]
```

**Output:** `1`

---

## ✅ Constraints

- `1 <= players.length, trainers.length <= 10^5`
- `1 <= players[i], trainers[j] <= 10^9`

---

## 💡 Approach

We sort both arrays and use **two pointers** to greedily assign the lowest available trainer who can train the current player.

### ✅ Algorithm (Two-Pointer):
```java
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int p = 0, t = 0, count = 0;

        while (p < players.length && t < trainers.length) {
            if (players[p] <= trainers[t]) {
                count++;
                p++;
            }
            t++;
        }

        return count;
    }
}
```

### Time Complexity:
- Sorting: `O(n log n + m log m)`
- Matching: `O(n + m)`
- **Total:** `O(n log n + m log m)`

### Space Complexity:
- `O(1)` (in-place sorting and no extra structures)

---

## 🔁 Related Problems

- [Assign Cookies (LeetCode 455)](https://leetcode.com/problems/assign-cookies/)
- [Maximum Bipartite Matching (Graph Based)](https://en.wikipedia.org/wiki/Matching_(graph_theory))

---

## 👨‍💻 Tags

`Greedy` | `Two Pointers` | `Sorting`

---

## 🏢 Asked in

Amazon, Google, Facebook, Bloomberg
