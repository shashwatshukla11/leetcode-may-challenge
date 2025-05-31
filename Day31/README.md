# 🗓️ Day 31 - Snakes and Ladders

### 🔗 [Problem Link](https://leetcode.com/problems/snakes-and-ladders/)  
**Difficulty:** Medium

---

## 📄 Problem Statement

You are given an `n x n` integer matrix `board` representing a Snakes and Ladders game board. The board cells are labeled from 1 to n² in a **Boustrophedon style** starting from the bottom-left corner of the board (i.e., `board[n - 1][0]`), alternating direction in each row.

Starting from square 1, in each move:

- You roll a 6-sided die and move from your current square `curr` to a square `next` in the range `[curr + 1, min(curr + 6, n²)]`.
- If `next` has a snake or ladder (i.e., `board[r][c] != -1`), you must move to the destination of that snake or ladder.
- You take at most one snake or ladder per move.
- The game ends when you reach square `n²`.

Return the **minimum number of dice rolls** to reach square `n²`. If it is impossible, return `-1`.

---

## 🧠 Approach

- Use **Breadth-First Search (BFS)** starting from square 1.
- Each BFS step simulates a dice roll (1 to 6 moves ahead).
- Convert the square number to `(row, col)` using the Boustrophedon pattern.
- If a ladder or snake exists at the new position, move accordingly.
- Track visited squares to avoid revisiting.
- Stop when you reach square `n²`.

---
## 📊 Complexity Analysis
- Time Complexity: `O(n²)`
- Space Complexity: `O(n²)`

## 📝 Notes
- BFS is ideal for shortest path on unweighted graphs.
- The Boustrophedon pattern requires careful row and column calculation.
- Only one snake or ladder per move is followed.
