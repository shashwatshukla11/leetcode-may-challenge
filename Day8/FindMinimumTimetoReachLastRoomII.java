
class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length;
        int n = moveTime[0].length;
        int[][] min_time = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(min_time[i], Integer.MAX_VALUE);
        }
        min_time[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0])); 
        pq.offer(new int[]{0, 0, 0, 2}); 

        while (!pq.isEmpty()) {
            int[] entry = pq.poll();
            int cur_time = entry[0], i = entry[1], j = entry[2], move_time = entry[3];
            if (i == m - 1 && j == n - 1) return cur_time;
            int new_move_time = (move_time == 1) ? 2 : 1;
            int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int[] dir : dirs) {
                int ni = i + dir[0], nj = j + dir[1];
                if (ni < 0 || ni == m || nj < 0 || nj == n) continue;
                int new_time = Math.max(cur_time, moveTime[ni][nj]) + new_move_time;
                if (min_time[ni][nj] > new_time) {
                    min_time[ni][nj] = new_time;
                    pq.offer(new int[]{new_time, ni, nj, new_move_time});
                }
            }
        }
        return -1;
    }
}
