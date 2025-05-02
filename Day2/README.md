
## Day 02: Push Dominoes  
**Problem Link:** [LeetCode - Push Dominoes](https://leetcode.com/problems/push-dominoes)

---

### 🧩 Problem Statement  
You are given a string `dominoes` representing a row of dominoes, where:
- `'L'` means the domino has been pushed to the left,
- `'R'` means the domino has been pushed to the right,
- `'.'` means the domino is upright and hasn't been pushed.

Dominoes pushed to the left or right will exert force on adjacent upright dominoes, causing them to fall in the same direction unless they are being pushed from both sides simultaneously (in which case they remain upright due to balanced forces).

Return a string representing the final state of the dominoes after all movements have occurred.

---

### 🔍 Approach

1. **Simulate Force from Left to Right**  
   - Traverse the dominoes from left to right.
   - Maintain a force value that resets to `n` (length of the string) when an `'R'` is seen.
   - Decrease the force by 1 for each `'.'`, and reset it to `0` when `'L'` is encountered.
   - Add this force to a `forces[]` array.

2. **Simulate Force from Right to Left**  
   - Do a similar traversal from right to left.
   - Maintain a force value for `'L'` dominoes (negative direction).
   - Subtract this force from the `forces[]` array to get the net force.

3. **Determine Final State Based on Net Force**  
   - If net force is positive, the domino falls to the right (`'R'`).
   - If net force is negative, the domino falls to the left (`'L'`).
   - If net force is zero, it remains upright (`'.'`).

---

### 💡 Time and Space Complexity
- **Time Complexity:** O(n)  
  Two passes over the string plus one pass to build the result.
- **Space Complexity:** O(n)  
  To store the net forces acting on each domino.

---
