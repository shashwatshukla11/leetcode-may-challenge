# Day 04: Number of Equivalent Domino Pairs  

**Problem Link:** [LeetCode - 1128. Number of Equivalent Domino Pairs](https://leetcode.com/problems/number-of-equivalent-domino-pairs/)

---

### 🧩 **Problem Statement**

You are given a list of dominoes where `dominoes[i] = [a, b]`.  
Two dominoes are **equivalent** if one can be rotated to match the other:  
i.e., either `(a == c and b == d)` or `(a == d and b == c)`.

Return the **number of unique pairs** `(i, j)` such that `0 <= i < j < dominoes.length`  
and `dominoes[i]` is equivalent to `dominoes[j]`.

---

### 🔍 **Approach**

- Use a **2D frequency matrix** `n[10][10]` (since values are from 1 to 9).
- Normalize each domino pair so that the **larger number is at index 0** and smaller at index 1.
- Count how many times each normalized pair has been seen before.
- Add this count to the total before incrementing the frequency.

---

### 💡 **Time and Space Complexity**

- **Time Complexity:** `O(n)`  
  → One pass over the dominoes array.

- **Space Complexity:** `O(1)`  
  → Constant size 2D array (10 × 10) to store counts.

---
