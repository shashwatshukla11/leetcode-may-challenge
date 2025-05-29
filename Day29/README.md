# 🗓️ Day 29 Maximize the Number of Target Nodes After Connecting Trees II

## 🔢 Problem: [3373. Maximize the Number of Target Nodes After Connecting Trees II](https://leetcode.com/problems/maximize-the-number-of-target-nodes-after-connecting-trees-ii)
---

## 🧩 Problem Statement

You are given two undirected trees:
- Tree 1 with `n` nodes labeled from `0` to `n-1`
- Tree 2 with `m` nodes labeled from `0` to `m-1`

Each tree is represented using edge lists:  
- `edges1[i] = [ai, bi]` for Tree 1  
- `edges2[i] = [ui, vi]` for Tree 2  

A **target node** to a node `v` is defined as any node `u` such that the number of edges on the path from `u` to `v` is **even**.  
(Every node is a target to itself.)

You're allowed to **connect one node** from Tree 1 to **one node** from Tree 2.  
This connection is virtual and temporary for each node in Tree 1.  
You must calculate, for each node `i` in Tree 1, the **maximum number of target nodes** it can have after this connection.

Return an array `res` of length `n` such that `res[i]` is the maximum number of target nodes for node `i`.

---
## 🔍 Approach

### Key Observations
- Even-distance condition is equivalent to same parity of depth in the tree.
- So, from any node, target nodes are those with the same parity (either even or odd) in BFS/DFS levels.
- We color each node 0 or 1 based on whether their depth is even or odd.
- From any node in Tree 1, we want:
  - Number of same-parity nodes in its tree +
  - Maximum of either parity count from Tree 2 (since we can choose any node in Tree 2 for optimal match)

---
## 💡 Complexity Analysis
- Time Complexity: `O(N + M)`
  - One DFS per tree.
- Space Complexity: `O(N + M)`
  - Adjacency list + color arrays

---

## 📌 Key Takeaway
This problem uses **tree parity coloring**(even/odd levels) to efficiently simulate path length parity checks between nodes, enabling constant-time lookups for each query.
