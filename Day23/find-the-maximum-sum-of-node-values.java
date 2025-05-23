class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long sum = 0;
        int cnt = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int num : nums) {
            int X = num ^ k;
            if (X > num) {
                sum += X;
                cnt++;
            } else {
                sum += num;
            }
            minDiff = Math.min(minDiff, Math.abs(X - num));
        }

        if ((cnt & 1) == 1) {
            return sum - minDiff;
        }
        return sum;
    }
}
