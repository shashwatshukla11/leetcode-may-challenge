# 🗓️ Day 28 Maximize the Number of Target Nodes After Connecting Trees I

## 🔢 Problem: [3372. Maximize the Number of Target Nodes After Connecting Trees I](https://leetcode.com/problems/maximize-the-number-of-target-nodes-after-connecting-trees-i)
---

## 🧩 Problem Statement

You are given two **trees** represented by `edges1` (with `n` nodes) and `edges2` (with `m` nodes).  
Each tree is **undirected**, and each node has **distinct labels** in `[0, n-1]` and `[0, m-1]` respectively.

You're also given an integer `k`.  
Define:
- A **target node** is one that is reachable within ≤ `k` edges from another node.
- A **node is always target to itself**.

You are allowed to **connect any one node** from the first tree to **any one node** in the second tree.  
You must do this once **for every node in tree1**, and compute the **maximum number of target nodes** reachable from that node after connection.

Return an array `answer[]` such that `answer[i]` is the **maximum number of target nodes** for node `i` in the first tree.

---

## 🔍 Approach

1. Convert both trees into adjacency lists.
2. For each node in `tree2`, precompute the **maximum number of reachable nodes within `k-1`** steps (as this simulates the connection adding 1 step).
3. For each node in `tree1`, calculate the **number of reachable nodes within `k`**.
4. For every node in `tree1`, **add the maximum of the tree2 contributions** to its own count.

---
## 🧮 Complexity  
- **Time Complexity:**  
  - `O(n * k + m * k)` → BFS runs from every node in both trees, depth bounded by `k`
- **Space Complexity:**  
  - `O(n + m)` for storing trees and visited flags

---
