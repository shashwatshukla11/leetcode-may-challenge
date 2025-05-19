# Day 19: Type of Triangle  
**Problem Link:** [LeetCode - 3024. Type of Triangle](https://leetcode.com/problems/type-of-triangle/)

---

### 🧩 **Problem Statement**

You are given a 0-indexed integer array `nums` of size **3**, representing the lengths of sides. You need to determine the **type of triangle** (if any) that can be formed:

- **Equilateral**: All sides are equal.
- **Isosceles**: Exactly two sides are equal.
- **Scalene**: All three sides are of different lengths.
- Return `"none"` if it is **not possible** to form a triangle.

---

### 🔍 **Approach**

1. **Sort the array** to ensure the largest side is at the end (`c`), making the triangle inequality easy to check.
2. **Triangle Inequality Rule**: A triangle is valid **iff** the sum of the two smaller sides is **strictly greater** than the largest side.
3. **Classification**:
   - All sides equal → `"equilateral"`
   - Exactly two sides equal → `"isosceles"`
   - All sides different → `"scalene"`

---

### 📊 Time and Space Complexity
  - Time Complexity:
    - `O(1)` for logic
    - `O(log 3) ≈ O(1)` for sorting a fixed-size array
    - ✅ Overall: O(1)

  - Space Complexity:
    - Only constant space used
    - ✅ O(1)
