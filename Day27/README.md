# 🗓️ Day 27 Divisible and Non-divisible Sums Difference

## 🔢 Problem: [2894. Divisible and Non-divisible Sums Difference](https://leetcode.com/problems/divisible-and-non-divisible-sums-difference)  
---

## 🧩 Problem Statement

You are given two **positive integers** `n` and `m`.

Define two values:
- `num1`: The **sum of all integers** in range `[1, n]` that are **not divisible** by `m`.
- `num2`: The **sum of all integers** in range `[1, n]` that **are divisible** by `m`.

Return `num1 - num2`.

---

## 🔍 Approach

1. Initialize two sums:
   - `n1` for non-divisible
   - `n2` for divisible
2. Loop from `1` to `n`:
   - If `i % m == 0` → add to `n2`
   - Else → add to `n1`
3. Return `n1 - n2`

---
## 🧮 Complexity  
- **Time Complexity:** $$O(n)$$
  - (Loop runs from 1 to `n`)
- **Space Complexity:** $$O(1)$$
  - (Constant space usage) 
