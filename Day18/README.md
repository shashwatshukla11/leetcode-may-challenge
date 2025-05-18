# Day 18: Painting a Grid With Three Different Colors  
**Problem Link:** [LeetCode - 1931. Painting a Grid With Three Different Colors](https://leetcode.com/problems/painting-a-grid-with-three-different-colors/)

---

### 🧩 **Problem Statement**

You are given two integers `m` and `n`. Consider an `m x n` grid where each cell is initially white. You can paint each cell **red, green, or blue**, but:

- **No two adjacent cells** (up, down, left, right) can have the **same color**.
- Return the **number of valid ways** to color the grid **modulo `10^9 + 7`**.

---

### 🔍 **Approach**

This is a **dynamic programming with state compression** problem.

- For a given column, generate all valid vertical color combinations (states) for height `m` such that no adjacent cells in that column have the same color.
- Use DP to transition between valid column states that are also compatible **horizontally** (no same color between adjacent columns).
- For each column from left to right, count the number of ways to reach each valid state based on previous column states.

---

### **📊 Time and Space Complexity**

 - Time Complexity: O(N * S^2 * M)
    - N is the number of columns.
    - S is the number of valid states (exponential in M).
    - Each column transition checks compatible state pairs.

- Space Complexity:
    - O(S) for storing DP state transitions, where S is the number of vertical colorings of height m.

---
