# 📅 Day 14 - [3337. Total Characters in String After Transformations II](https://leetcode.com/problems/total-characters-in-string-after-transformations-ii/)

## 🧾 Problem Statement:
You are given:
- A string `s` consisting of lowercase English letters,
- An integer `t` (number of transformations),
- An array `nums` of size 26, where `nums[i]` determines how many **next** characters each letter expands into.

### Transformation Rule:
- Replace `s[i]` with the next `nums[s[i] - 'a']` characters in the alphabet.
- Wrapping is allowed (e.g., `'y' + 3 → zab`).

### Return:
The **length** of the resulting string after `t` transformations, modulo **10⁹ + 7**.

---

## 🧠 Approach:

### Matrix Exponentiation + Linear Algebra:
- Represent character transformation via a **26x26 transition matrix**.
- Each transformation multiplies the character frequency vector.
- Use **fast matrix exponentiation** to apply `t` transformations efficiently.

### Steps:
1. Build a transition matrix `T` based on `nums`.
2. Use matrix exponentiation to raise `T` to power `t`.
3. Multiply the final matrix with the frequency vector of `s`.
4. Sum the resulting vector modulo 1e9+7.

---

## ⏱️ Time and Space Complexity:
- **Time Complexity:** `O(26³ * log t)` for matrix exponentiation.
- **Space Complexity:** `O(26²)` for storing matrices.

---
