## Day 07: Find Minimum Time to Reach Last Room I  
**Problem Link:** [LeetCode - Find Minimum Time to Reach Last Room I](https://leetcode.com/problems/find-minimum-time-to-reach-last-room-i)

---

🧩 **Problem Statement**  
There is a dungeon with `n x m` rooms arranged in a grid.

You are given a 2D array `moveTime` of size `n x m`, where `moveTime[i][j]` represents the minimum time in seconds when you can start moving to that room. You start from the room `(0, 0)` at time `t = 0` and can move to an adjacent room. Moving between adjacent rooms takes exactly **one second**.

Return the **minimum time** to reach the room `(n - 1, m - 1)`.

Two rooms are adjacent if they share a common wall (either horizontally or vertically).

---

🔍 **Approach**  
**Modified Dijkstra / BFS with Priority Queue**

- Use a **priority queue (min-heap)** to always process the room reachable in the least time.
- Each element in the queue is a triplet of `{currentTime, row, col}`.
- From the current room, attempt to move in all 4 directions.
- For each valid move, calculate the next room’s **entry time** as `max(currentTime, moveTime[newR][newC]) + 1`.
- If the destination `(n-1, m-1)` is reached, return the current calculated time.
- Track visited rooms to avoid reprocessing.

---

💡 **Time and Space Complexity**  
- **Time Complexity:** `O(n * m * log(n * m))`  
  Each room is pushed into the priority queue at most once, and each heap operation takes `log(n * m)` time.

- **Space Complexity:** `O(n * m)`  
  For the visited matrix and the priority queue.
