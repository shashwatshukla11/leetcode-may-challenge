# Day 21: Set Matrix Zeroes  
**Problem Link:** [LeetCode - 73. Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)

---

### 🧩 **Problem Statement**

Given an `m x n` integer matrix `matrix`, if an element is `0`, set its entire row and column to `0`s.

You must do it **in-place**.

---

### 🔍 **Approach**

- Create two auxiliary arrays `row[]` and `col[]` to keep track of which rows and columns should be zeroed.
- First pass:
  - Iterate through the matrix.
  - If an element is `0`, mark its corresponding row and column.
- Second pass:
  - Iterate through the matrix again.
  - If the current element’s row or column is marked, set it to `0`.

---

### 📊 Time and Space Complexity

- **Time Complexity:** `O(m * n)`  
  Two complete passes through the matrix: one to identify rows and columns to zero, and one to set the elements.

- **Space Complexity:** `O(m + n)`  
  Additional space used for two arrays: `row[]` of size `m` and `col[]` of size `n`.
