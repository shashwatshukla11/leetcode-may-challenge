# Day 09: Count Number of Balanced Permutations

**Problem Link:** [LeetCode - Count Number of Balanced Permutations](https://leetcode.com/problems/count-number-of-balanced-permutations)

---

## 🧩 Problem Statement

A string of digits is called **balanced** if the sum of the digits at even indices is equal to the sum at odd indices.

You are given a string `num`. Return the **number of distinct permutations** of `num` that are balanced.  
Since the answer may be very large, return it **modulo 10⁹ + 7**.

A **permutation** is a rearrangement of all the characters of a string.

### Examples:

**Input:** `num = "123"`  
**Output:** `2`  
**Explanation:** The distinct permutations of `num` are `"123"`, `"132"`, `"213"`, `"231"`, `"312"`, `"321"`.  
Among them, only `"132"` and `"231"` are balanced.

**Input:** `num = "112"`  
**Output:** `1`  
**Explanation:** Only `"121"` is balanced.

**Input:** `num = "12345"`  
**Output:** `0`  
**Explanation:** None of the permutations are balanced.

---

## 🔍 Approach

### 1. Preprocessing with Factorials
To efficiently calculate permutations and handle duplicates, we precompute:
- Factorials
- Inverse elements
- Inverse factorials  
All under modulo `10⁹ + 7` using Fermat's Little Theorem.

### 2. Check Sum Parity
If the **sum of digits** is odd, it's impossible to split evenly between even and odd indices → return 0 immediately.

### 3. DP Subset Count
We use a 2D DP table `dp[sum][len]`:
- `dp[s][l]` = number of ways to choose `l` digits with sum `s`
- We're targeting `n / 2` digits that sum to `totalSum / 2`

### 4. Count Total Balanced Permutations
After counting valid subsets, multiply:
- Number of subset combinations
- Factorials of both halves  
Then divide by factorials of **duplicate digits** to remove overcounting.

---

## 📊 Complexity Analysis

- **Time Complexity:** `O(n² * sum)` for DP, `O(n log n)` for factorial prep  
- **Space Complexity:** `O(n * sum)` for DP, `O(n)` for factorial arrays

---
