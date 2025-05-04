class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int c = 0; // Counter to hold number of equivalent pairs

        // 2D array to store frequency of each normalized domino pair
        int[][] n = new int[10][10];

        for (int i = 0; i < dominoes.length; i++) {
            // Normalize the domino so the larger value is always first
            if (dominoes[i][0] < dominoes[i][1]) {
                int t = dominoes[i][0];
                dominoes[i][0] = dominoes[i][1];
                dominoes[i][1] = t;
            }

            // Add current count of this normalized pair to result
            c = c + n[dominoes[i][0]][dominoes[i][1]];

            // Increment the frequency of the normalized pair
            n[dominoes[i][0]][dominoes[i][1]]++;
        }

        return c;
    }
}
