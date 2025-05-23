# 🗓️ Day 23 Find the Maximum Sum of Node Values

## 🔢 Problem: [3068. Find the Maximum Sum of Node Values](https://leetcode.com/problems/find-the-maximum-sum-of-node-values)  
---

## 🧩 Problem Statement

There exists an **undirected tree** with `n` nodes numbered from `0` to `n - 1`.  
You're given:

- A 2D array `edges` of length `n - 1`, where `edges[i] = [u, v]` represents an edge between nodes `u` and `v`.
- An array `nums` where `nums[i]` is the value of the `i-th` node.
- A positive integer `k`.

You can perform the following operation any number of times:

➡️ Choose any edge `[u, v]` and update the values as:  
`nums[u] = nums[u] ^ k`  
`nums[v] = nums[v] ^ k`

Return the **maximum possible sum** of node values that can be achieved.

---

## 🔍 Approach

1. For each node `i`, calculate `X = nums[i] ^ k`.
2. If `X > nums[i]`, consider transforming `nums[i]` to `X`.
3. Keep count of such beneficial transformations.
4. Sum all transformed or original values.
5. If count of transformed elements is **odd**, subtract the **smallest gain** (least beneficial transformation).
6. Return the final maximum sum.

---

## 💡 Complexity Analysis
- Time Complexity: O(n) – One pass through the nums array.
- Space Complexity: O(1) – Constant extra space.
