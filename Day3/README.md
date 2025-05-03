# Day 03: Minimum Domino Rotations For Equal Row  
**Problem Link:** [LeetCode - 1007. Minimum Domino Rotations For Equal Row](https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/)

---

### 🧩 **Problem Statement**

You are given two integer arrays `tops` and `bottoms` representing the top and bottom halves of dominoes.

You can rotate each domino (i.e., swap top and bottom).  
Return the **minimum number of rotations** needed so that all the values in `tops` or all the values in `bottoms` are the same.

If not possible, return `-1`.

---

### 🔍 **Approach**

- **Try two target values:** Either make all values equal to `tops[0]` or `bottoms[0]`.
- For each candidate target:
  - If neither side has the target value for a domino, it's impossible → return `-1`.
  - Count how many rotations are required to make all values equal to that target in either row.
- Return the **minimum** of the two rotation counts.

---

### 💡 **Time and Space Complexity**

- **Time Complexity:** `O(n)`  
  → One pass to check each target.

- **Space Complexity:** `O(1)`  
  → Constant space usage.

---
