class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0], b = nums[1], c = nums[2];

        // Check triangle validity
        if (a + b <= c) {
            return "none";
        }

        // Classify triangle
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
