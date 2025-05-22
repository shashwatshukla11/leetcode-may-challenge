# Day 22: 3362. Zero Array Transformation III 🧩
**Level:** Medium  
**Topics:** Greedy, Priority Queue, Prefix Sum 
---

### 🧾 Problem Statement

You are given an integer array `nums` of length `n` and a 2D array `queries` where `queries[i] = [li, ri]`.

Each `queries[i]` represents the following action on `nums`:
- Decrement the value at **each index** in the range `[li, ri]` in `nums` **by at most 1**.
- The amount by which the value is decremented can be **chosen independently** for each index.

A **Zero Array** is an array with **all elements equal to 0**.

🔁 Return the **maximum number of elements** that can be removed from `queries`, such that `nums` can still be converted to a zero array using the **remaining queries**.  
If it is not possible to convert `nums` to a zero array, return `-1`.

---

### 💡 Approach

- **Greedy + Prefix Sum + Max Heap**
- Sort queries by their starting index.
- Simulate from left to right using a difference array to track decrement effects.
- Use a max heap to greedily apply queries that can still cover the current index when needed.

---

### 📊 Time and Space Complexity
**Time Complexity:** `O(n + q log q)`
- q = number of queries
- Sorting queries and maintaining heap operations.
  
**Space Complexity:** `O(n + q)`
- effect[] array and a max heap to store query end indices.
