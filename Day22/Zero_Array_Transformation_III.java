class Solution {
    public int maxRemoval(int[] originalValues, int[][] operations) {
        // Sort operations based on their starting index
        Arrays.sort(operations, (op1, op2) -> Integer.compare(op1[0], op2[0]));

        int usedOperations = 0;
        int currentOpIndex = 0;
        int[] decreaseTracker = new int[originalValues.length + 1];
        int currentDecrease = 0;
        PriorityQueue<Integer> availableEnds = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < originalValues.length; i++) {
            currentDecrease += decreaseTracker[i];

            // If current value is still too big, we need to use operations
            if (currentDecrease < originalValues[i]) {
                // Add all operations that start before or at index i
                while (currentOpIndex < operations.length && operations[currentOpIndex][0] <= i) {
                    if (operations[currentOpIndex][1] >= i) {
                        availableEnds.add(operations[currentOpIndex][1]);
                    }
                    currentOpIndex++;
                }

                // Keep applying operations until the value is low enough
                while (currentDecrease < originalValues[i]) {
                    if (availableEnds.isEmpty() || availableEnds.peek() < i) {
                        return -1; // No valid operation left
                    }
                    int operationEnd = availableEnds.poll();
                    currentDecrease++;
                    decreaseTracker[operationEnd + 1]--; // Mark where the decrease should stop
                    usedOperations++;
                }
            }
        }

        // Return how many operations were not used
        return operations.length - usedOperations;
    }
}
