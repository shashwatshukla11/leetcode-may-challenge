# **Day 16 - 2901. Longest Unequal Adjacent Groups Subsequence II**

### 🔗 Problem Link: [LeetCode - 2901. Longest Unequal Adjacent Groups Subsequence II](https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-ii)

---

## **📝 Problem Statement**

You are given:
- A string array `words`
- An integer array `groups`, both of length `n`.

The **hamming distance** between two strings of equal length is the number of positions where corresponding characters differ.

You must find the **longest subsequence** of indices `[i0, i1, ..., ik-1]` such that:

1. `groups[ij] != groups[ij+1]` for each `j` (i.e., adjacent groups differ).
2. `words[ij]` and `words[ij+1]` are of equal length and have a hamming distance of exactly 1.

Return the words at these selected indices as a string array. If multiple answers exist, return any of them.

---

## **🧠 Approach**

- Use **memoization with DFS** to explore all possible subsequences.
- For each index `i`, start a DFS to build the longest valid subsequence starting from that word.
- Check two conditions during the recursion:
  - Group values differ.
  - Hamming distance between current and next word is exactly 1 and lengths match.
- Use memoization (`Map<String, List<String>>`) to store results for each state `(i, lastGroup, lastWord)` to avoid recomputation.

---

## **📈 Time and Space Complexity**

- **Time Complexity:** `O(n^2 * m)`, where `n` is the number of words and `m` is the average word length (due to pairwise comparison).
- **Space Complexity:** `O(n * m)` for memoization storage and recursion stack.

---

