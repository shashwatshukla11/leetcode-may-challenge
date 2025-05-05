# Day 05: Domino and Tromino Tiling  
**Problem Link:** [LeetCode - 790. Domino and Tromino Tiling](https://leetcode.com/problems/domino-and-tromino-tiling/)

---

### 🧩 **Problem Statement**

You are given a `2 x n` board and two types of tiles:  
- A **domino** tile (2×1 or 1×2), and  
- A **tromino** tile shaped like an L (can be rotated).

Return the number of ways to tile the entire `2 x n` board.  
Since the answer may be large, return it **modulo** `10^9 + 7`.

---

### 🔍 **Approach**

This is a classic **Dynamic Programming** problem.

Let `dp[n]` be the number of ways to tile a `2 x n` board.

#### Recurrence Relation:

- Base Cases:  
  - `dp[0] = 1` (empty board)  
  - `dp[1] = 1`  
  - `dp[2] = 2`

- For `n >= 3`:
