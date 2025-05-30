# 🗓️ Day 30 - Closest Meeting Node

### 🔗 [Problem Link](https://leetcode.com/problems/find-closest-node-to-given-two-nodes/)  
---

## 📄 Problem Statement

You are given a directed graph of `n` nodes numbered from `0` to `n - 1`, where each node has **at most one outgoing edge**.

The graph is represented with a 0-indexed array `edges` of size `n`, where `edges[i]` indicates the node that node `i` points to. If `i` has no outgoing edge, then `edges[i] == -1`.

You are also given two integers `node1` and `node2`.

Return the index of the node that can be reached from **both `node1` and `node2`**, such that the **maximum** of the distances from each source to that node is **minimized**.

If there are multiple such nodes, return the node with the **smallest index**. If no such node exists, return `-1`.

---

## 🧠 Approach

1. Traverse the graph from `node1` and `node2`, recording distances to each reachable node.
2. For every node `i`:
   - If reachable from both `node1` and `node2`, compute `max(dist1[i], dist2[i])`.
   - Track the **minimum** of these max distances.
3. Return the index of the node where this minimum occurs.

> Use simple iteration instead of DFS due to the at-most-one-outgoing-edge constraint.

---

## 📊 Complexity Analysis
- Time Complexity: O(n)
- Space Complexity: O(n)

## 📝 Notes
- Key idea: use two BFS-like traversals to fill distance arrays.
- Very efficient due to the at-most-one-edge property.
- Always consider early exits in loops if  `minMaxDist` can’t be improved further.
