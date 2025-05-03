class Solution {

    // Main function to calculate the minimum number of rotations
    public int minDominoRotations(int[] tops, int[] bottoms) {
        // First, try making all values equal to tops[0]
        int rotations = check(tops[0], tops, bottoms);

        if (rotations != -1 || tops[0] == bottoms[0]) {
            return rotations;
        }

        // Otherwise, try making all values equal to bottoms[0]
        return check(bottoms[0], tops, bottoms);
    }

    // Helper function to check if we can make all values equal to `target`
    // It returns the minimum number of rotations needed or -1 if not possible
    private int check(int target, int[] tops, int[] bottoms) {
        int topRotations = 0;     // Rotations needed to bring target to top
        int bottomRotations = 0;  // Rotations needed to bring target to bottom

        for (int i = 0; i < tops.length; i++) {
            // If neither top nor bottom has the target, it's impossible
            if (tops[i] != target && bottoms[i] != target) {
                return -1;
            }

            // If top doesn't have the target, we need a rotation to bring it to top
            if (tops[i] != target) {
                topRotations++;
            }

            // If bottom doesn't have the target, we need a rotation to bring it to bottom
            if (bottoms[i] != target) {
                bottomRotations++;
            }
        }

        // Return the minimum of the two possible rotations
        return Math.min(topRotations, bottomRotations);
    }
}
