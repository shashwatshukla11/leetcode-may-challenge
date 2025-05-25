# 🗓️ Day 25 Longest Palindrome by Concatenating Two Letter Words

## 🔢 Problem: [2131. Longest Palindrome by Concatenating Two Letter Words](https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words)  
---

## 🧩 Problem Statement

You are given an array of strings `words`. Each element of `words` consists of **two lowercase English letters**.

Create the **longest possible palindrome** by selecting some elements from `words` and concatenating them in **any order**. Each element can be selected **at most once**.

Return the **length of the longest palindrome** that you can create. If it is impossible to create any palindrome, return `0`.

A palindrome is a string that reads the same forward and backward.

---

## 🔍 Approach

1. Use a 2D matrix `newmati[26][26]` to count occurrences of each pair of characters.
2. Traverse the `words`:
   - If the reverse of the word already exists in the matrix, form a palindrome pair and add `4` to the answer.
   - Otherwise, increment the count of the current word in the matrix.
3. After pairing, check for any word like `"cc"` (where both characters are same) which can be placed in the center of the palindrome.
4. If found, add `2` to the answer and return.

---

## 💡 Complexity Analysis
- Time Complexity: `O(n)`
  - (where `n` is the length of the words array)

- Space Complexity: `O(1)`
  - (only a fixed-size 26x26 matrix is used)
