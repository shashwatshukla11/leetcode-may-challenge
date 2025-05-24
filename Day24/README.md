# 🗓️ Day 24 Find Words Containing Character
## 🔢 Problem: [2942. Find Words Containing Character](https://leetcode.com/problems/find-words-containing-character)  

## 🧩 Problem Statement
You are given a 0-indexed array of strings `words` and a character `x`.  
Return an array of indices representing the words that contain the character `x`.

> The returned array may be in **any order**.

---

## 🔍 Approach

1. Create an empty list to store indices.
2. Traverse the `words` array.
3. For each word, check if it contains the character `x`.
4. If yes, add its index to the list.
5. Return the final list.

---

## 💡Complexity Analysis
- Time Complexity: `O(n * m)`
(Where `n` is number of words and `m` is average word length due to `contains` check)

- Space Complexity: `O(k)`
(Where  `k` is number of matching indices stored)
