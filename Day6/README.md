
# Day 06: Build Array from Permutation  
**Problem Link:** [LeetCode - 1920. Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)

---

### 🧩 Problem Statement

You're given a **zero-based permutation** array `nums`, where:

- `nums.length == n`  
- `nums` contains all integers from `0` to `n - 1` **exactly once**

Your task is to build a new array `ans` of the same length such that:
```
ans[i] = nums[nums[i]]
```

🔁 You’re essentially using each value in `nums[i]` as an index to look up another value in `nums`.

---

### ✨ Example

**Input:**  
`nums = [0, 2, 1, 5, 3, 4]`  

**Build:**  
```
ans = [nums[nums[0]], nums[nums[1]], ..., nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0, 1, 2, 4, 5, 3]
```

**Output:**  
`[0, 1, 2, 4, 5, 3]`

---

### 🔍 Approach

1. Create a new array `ans` of the same length as `nums`.
2. Iterate over each index `i`:
   - Set `ans[i] = nums[nums[i]]`
3. Return the final `ans` array.

---

### 💡 Time and Space Complexity

- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(n)` – since we're using an extra array for the result

---
