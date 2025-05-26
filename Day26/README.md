# 🗓️ Day 26 Largest Color Value in a Directed Graph

## 🔢 Problem: [1857. Largest Color Value in a Directed Graph](https://leetcode.com/problems/largest-color-value-in-a-directed-graph)  
---

## 🧩 Problem Statement

You are given:
- A **directed graph** of `n` colored nodes and `m` edges.
- A string `colors` where `colors[i]` represents the **color** of the `i-th` node.
- A 2D array `edges` where `edges[j] = [aj, bj]` is a directed edge from node `aj` to node `bj`.

A valid path is a sequence of nodes connected by directed edges.  
The **color value** of a path is the **number of nodes** in that path having the most **frequent color**.

Return the **largest color value** of any valid path.  
If there is a **cycle** in the graph, return `-1`.

---

## 🔍 Approach

1. Represent the graph using **adjacency list** and track **in-degrees** of each node.
2. Use **Kahn's Algorithm** for **topological sort** to detect cycles.
3. Maintain a `dp[node][color]` matrix where:
   - `dp[node][c]` stores the **maximum frequency** of color `c` up to that node.
4. Start BFS with nodes having in-degree 0.
5. During traversal, update the `dp` values of neighbors.
6. If a cycle is detected (not all nodes visited), return `-1`.
7. Otherwise, return the **maximum color frequency** found.

---

## 🧮 Complexity  
- **Time Complexity:** $$O(n + m + 26n)$$
    - `n` = number of nodes, `m` = number of edges
- **Space Complexity:** $$O(26n + n + m)$$
    - For `dp` table, graph representation, and in-degree array

