# 📅 Day 12 - [2094. Finding 3-Digit Even Numbers](https://leetcode.com/problems/finding-3-digit-even-numbers/)

## 🧾 Problem Statement:
You are given an integer array `digits`, where each element is a digit. The array may contain duplicates.

You need to find all the **unique integers** that meet the following conditions:
- The number consists of the **concatenation of three digits** from the array.
- It does **not** have a **leading zero**.
- It is an **even number**.

Return a **sorted array** of all such unique integers.

---

## 🧠 Approach:
- Create a frequency array `freq[10]` to count occurrences of each digit.
- Loop through all 3-digit even numbers from `100` to `998` (step by `2` to ensure even numbers).
- For each number:
  - Extract its hundreds, tens, and units digits (`a`, `b`, `c`).
  - Create a local frequency array `local[10]` to count digits used in the number.
  - Check if the number can be formed with the available digits by ensuring `local[d] <= freq[d]` for all digits.
  - If valid, add the number to the result list.
- Return the final result list.

---

## ⏱️ Time and Space Complexity:
- **Time Complexity:** `O(450 * 10)` = `O(4500)` ≈ constant, since we loop from 100 to 998 in steps of 2.
- **Space Complexity:** `O(1)` — only fixed-size arrays and list used.

---
