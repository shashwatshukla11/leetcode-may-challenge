# Day 20: Zero Array Transformation I  
**Problem Link:** [LeetCode - 3355. Zero Array Transformation I](https://leetcode.com/problems/zero-array-transformation-i/)

---

### 🧩 **Problem Statement**

You are given:
- An integer array `nums` of length `n`
- A list of `queries`, where each query `[li, ri]` specifies a **range**

For each query:
- Choose **any subset of indices** within range `[li, ri]`
- Decrease the values at those selected indices by **1**

You must process all queries in order.

**Return `true` if it is possible to transform `nums` into a Zero Array** (i.e., all values become `0`), else return `false`.

---

### 🔍 **Approach**

We use a **difference array** to keep track of how many times we are allowed to decrement each element.

1. Initialize a difference array `diff[]` of size `n`.
2. For every query `[l, r]`, increment `diff[l]` and decrement `diff[r+1]` (if in bounds). This models a range increment.
3. Convert the difference array into a **prefix sum** `curr` to calculate how many times each index is affected by queries.
4. If at any index `i`, the number of operations (`curr`) is **less than `nums[i]`**, it's impossible to reduce `nums[i]` to `0`, so return `false`.
5. If all elements can be reduced to 0 or less, return `true`.

---

### 📊 **Time and Space Complexity**

- **Time Complexity:**  
  ✅ `O(n + q)` where `n` is the length of `nums`, and `q` is the number of queries

- **Space Complexity:**  
  ✅ `O(n)` for the difference array
