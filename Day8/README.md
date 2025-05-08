# Day 08: Find Minimum Time to Reach Last Room II  
**Problem Link:** [LeetCode - 3342. Find Minimum Time to Reach Last Room II](https://leetcode.com/problems/find-minimum-time-to-reach-last-room-ii/)

---

### 🧩 **Problem Statement**

There is a dungeon with `n x m` rooms arranged as a grid.

You are given a 2D array `moveTime` of size `n x m`, where `moveTime[i][j]` represents the **minimum time** in seconds when you can **start moving to that room**.

- You start from the room `(0, 0)` at time `t = 0`.
- You can move to **adjacent rooms** (up, down, left, right).
- Moving between adjacent rooms takes:
  - **1 second** for the **first** move,
  - **2 seconds** for the **next**,
  - alternating thereafter.

Return the **minimum time** to reach the room `(n - 1, m - 1)`.

---

### 🔍 **Approach**

- Use **Dijkstra's algorithm** with a priority queue to always expand the earliest possible reachable room.
- Each entry in the queue keeps track of:
  - `current time`,
  - `row` and `col` position,
  - `next move time` (either 1 or 2).
- For each move:
  - Calculate the **maximum** of the current time and the moveTime constraint.
  - Add the time cost of the move (alternating 1 or 2).
- Track the minimum time to reach each cell in a 2D array `min_time`.

---

### 💡 **Time and Space Complexity**

- Time Complexity: `O(n * m * log(n * m))`
  - Each cell is visited with a priority queue operation.

- Space Complexity: `O(n * m)`
  - For storing the minimum time grid and priority queue.
---
