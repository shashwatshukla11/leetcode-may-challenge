# 📅 Day 13 - [3335. Total Characters in String After Transformations I](https://leetcode.com/problems/total-characters-in-string-after-transformations-i/)

## 🧾 Problem Statement:
You are given a string `s` and an integer `t`, representing the number of transformations to perform. In one transformation, each character in `s` is replaced using these rules:
- If the character is `'z'`, replace it with the string `"ab"`.
- Otherwise, replace it with the **next character** in the alphabet (e.g., `'a' → 'b'`, `'y' → 'z'`, etc.).

Return the **length** of the resulting string after exactly `t` transformations, **modulo** `10⁹ + 7`.

---

## 🧠 Approach:
- Use a frequency array `freq[26]` to track how many times each character appears.
- For each transformation:
  - Save the count of `'z'` (index `25`).
  - Shift all characters from `'a'` to `'y'` one step forward in the array.
  - Set count of `'a'` to old `'z'` count.
  - Add the old `'z'` count to `'b'` to account for `'z' → ab`.
- After `t` transformations, sum the values in the `freq[]` array to get the final length.

---

## ⏱️ Time and Space Complexity:
- **Time Complexity:** `O(26 * t)` → Efficient since character set size is constant.
- **Space Complexity:** `O(1)` → Constant space for the frequency array.

---
