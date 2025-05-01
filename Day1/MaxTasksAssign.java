import java.util.Arrays;

class Solution {
    int[] deque;

    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int tsize = tasks.length;
        int wsize = workers.length;
        deque = new int[tsize];  // To store the indices of tasks

        int max = 0;
        int left = 0;
        int right = Math.min(tsize, wsize);

        // Binary search to find the maximum number of tasks that can be assigned
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(tasks, workers, 0, mid - 1, wsize - mid, wsize - 1, pills, strength)) {
                max = mid;
                left = mid + 1;  // Try for more tasks
            } else {
                right = mid - 1;  // Reduce the number of tasks
            }
        }
        return max;
    }

    // Helper function to check if we can assign 'mid' tasks
    private boolean check(int[] tasks, int[] workers, int tl, int tr, int wl, int wr, int pills, int strength) {
        int cnt = 0;
        int h = 0, t = 0;

        // Try to assign tasks to workers
        for (int i = wl, j = tl; i <= wr; i++) {

            // Add tasks that the current worker can perform without a pill
            while (j <= tr && tasks[j] <= workers[i]) {
                deque[t++] = j++;
            }

            // If the current worker can perform the task without a pill
            if (h < t && tasks[deque[h]] <= workers[i]) {
                h++;
            } else {
                // Assign task with a pill if possible
                while (j <= tr && tasks[j] <= workers[i] + strength) {
                    deque[t++] = j++;
                }

                // If we can assign a task to the worker with a pill
                if (h < t) {
                    cnt++;
                    t--;
                } else {
                    return false;  // No task can be assigned
                }
            }
        }
        return cnt <= pills;  // Check if we used fewer or equal pills than available
    }
}
