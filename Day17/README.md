# Day 17: Sort Colors  
**Problem Link:** [LeetCode - 75. Sort Colors](https://leetcode.com/problems/sort-colors/)

---

### 🧩 **Problem Statement**

Given an array `nums` with `n` objects colored red, white, or blue, sort them **in-place** so that objects of the same color are adjacent, with the colors in the order **red (0)**, **white (1)**, and **blue (2)**.

You must solve this problem **without using the library's sort function**.

---

### 🎯 **Constraints**

- `1 <= nums.length <= 300`
- `nums[i]` is either `0`, `1`, or `2`.

**Follow-up:** Can you come up with a one-pass algorithm using only constant extra space?

---

### 🔍 **Approach**

You implemented **Merge Sort**, a classic divide-and-conquer sorting algorithm:

- **Divide:** Split the array into two halves recursively.
- **Conquer:** Sort each half.
- **Combine:** Merge the two sorted halves.

While this doesn't satisfy the one-pass constraint, it is a valid and stable sorting algorithm.

---
### 📊 **Time and Space Complexity**

- **Time Complexity:**  
  - `O(n log n)` — Merge Sort divides the array recursively and merges sorted halves.

- **Space Complexity:**  
  - `O(n)` — Additional space is used for the temporary arrays during merge steps.

