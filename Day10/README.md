# 🗓️ Day 10 Minimum Equal Sum of Two Arrays After Replacing Zeros

## 🔢 Problem: [2918. Minimum Equal Sum of Two Arrays After Replacing Zeros](https://leetcode.com/problems/minimum-equal-sum-of-two-arrays-after-replacing-zeros/)  
---

## 🧩 Problem Statement

You are given two arrays `nums1` and `nums2` consisting of **positive integers**.  
You have to replace all the **0's** in both arrays with **strictly positive integers** such that the **sum of both arrays becomes equal**.

Return the **minimum equal sum** you can obtain, or **-1** if it is impossible.

---

## 🔍 Approach

1. Count number of `0`s in both arrays.
2. Assume all `0`s are replaced with `1` (minimum positive integer).
3. Calculate new sums for both arrays.
4. If one array has no zeros but still has smaller sum, return `-1`.
5. Otherwise, return the **maximum of the two new sums**.

---

## 💡 Complexity Analysis

- **Time Complexity:** `O(n + m)`  
- **Space Complexity:** `O(1)`

---
