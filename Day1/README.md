# Day 01: Maximum Number of Tasks You Can Assign

**Problem Link:** [LeetCode - Maximum Number of Tasks You Can Assign](https://leetcode.com/problems/maximum-number-of-tasks-you-can-assign/)

## 🧩 Problem Statement

You are given `n` tasks and `m` workers. Each task has a strength requirement stored in a 0-indexed integer array `tasks`, where the `i-th` task requires `tasks[i]` strength to complete. Each worker has strength stored in a 0-indexed integer array `workers`, where the `j-th` worker has `workers[j]` strength. A worker can only be assigned to a single task and must have a strength greater than or equal to the task's strength requirement (i.e., `workers[j] >= tasks[i]`).

Additionally, you have a certain number of magical pills (`pills`), each of which increases a worker's strength by a given amount (`strength`). You can decide which workers receive the magical pills, but you may give each worker at most one pill.

The goal is to return the **maximum number of tasks** that can be completed.

---

## 🔍 Approach

### **1. Sort the Tasks and Workers**
First, we sort both the `tasks` and `workers` arrays in ascending order. This allows us to use a greedy approach, attempting to assign the least demanding tasks to the weakest workers.

### **2. Use Binary Search for Optimization**
We perform a **binary search** over the possible number of tasks (`mid`) that can be assigned. The binary search checks the maximum number of tasks that can be completed by workers using both their natural strength and the magical pills.

### **3. Greedy Task Assignment**
For each worker, we attempt to assign them tasks:
   - If the worker is strong enough to handle a task without a pill, assign the task.
   - If the worker is not strong enough, we check if they can handle the task using a magical pill (if available).
   - A deque (double-ended queue) is used to efficiently manage the assignments and workers.

### **4. Check Feasibility for a Given Number of Tasks**
The helper function `check()` verifies if it is possible to assign exactly `mid` tasks. It tracks task assignments and pill usage, ensuring the number of pills does not exceed the available amount.

### **5. Time Complexity**
- Sorting the tasks and workers arrays takes **O(n log n + m log m)**, where `n` is the number of tasks and `m` is the number of workers.
- The binary search runs **O(log(min(n, m)))** times, and for each iteration, the `check` function takes **O(n + m)**.
- Therefore, the total time complexity is **O(n log n + m log m + m log(min(n, m)))**.

---
