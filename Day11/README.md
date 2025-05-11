# 📅 Day 11 - [1550. Three Consecutive Odds](https://leetcode.com/problems/three-consecutive-odds/)

## 🧾 Problem Statement:
Given an integer array `arr`, return `true` if there are **three consecutive odd numbers** in the array. Otherwise, return `false`.

## 🧠 Approach:
- Initialize a counter `count` to `0` to track the number of consecutive odd numbers.
- Traverse the array:
  - If the current number is **odd**, increment `count`.
  - If it's **even**, reset `count` to `0`.
  - If at any point `count == 3`, return `true`.
- If the loop finishes without finding three consecutive odds, return `false`.

---

## ⏱️ Time and Space Complexity:
- **Time Complexity:** `O(n)` — where `n` is the length of the input array.
- **Space Complexity:** `O(1)` — uses constant space.

---
