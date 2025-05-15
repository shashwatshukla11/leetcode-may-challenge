# 📅 Day 15 - [2900. Longest Unequal Adjacent Groups Subsequence I](https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/)

## 🧾 Problem Statement:
You are given:
- A string array `words` and a binary array `groups`, both of length `n`.
- Each `words[i]` is associated with `groups[i]`.

### Task:
Select the **longest alternating subsequence** from `words` where **no two adjacent elements have the same group** (i.e., `groups[i] != groups[i+1]` for selected indices).

- The subsequence must be **in order** but not necessarily contiguous.
- If multiple valid subsequences exist, return **any one**.

---
### Greedy Linear Scan:
- Start from the first word.
- For every next word, **add it only if its group is different** from the previous selected word's group.
- This guarantees a longest alternating subsequence due to distinct elements and small constraints.

---

## ⏱️ Time and Space Complexity:
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for storing the result)

---

