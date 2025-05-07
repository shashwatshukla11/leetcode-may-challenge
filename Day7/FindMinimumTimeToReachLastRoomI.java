class Solution {
    public int minTimeToReach(int[][] moveTime) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);

        pq.offer(new int[]{0, 0, 0 });

        int m = moveTime.length, n = moveTime[0].length;

        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;

        int[][] dirs = new int[][]{ {0,1}, {1,0}, {0,-1}, {-1,0} };

        while( !pq.isEmpty() ){
            
            int[] curr = pq.poll();
            
            for( int[] d : dirs ){
                int newR = d[0] + curr[1];
                int newC = d[1] + curr[2];

                if( newR < 0 || newR == m || newC < 0 || newC == n || visited[newR][newC] ) continue;

                int newTime = Math.max(curr[0], moveTime[newR][newC])+1;

                if( newR == m-1 && newC == n-1 ) return newTime;

                visited[newR][newC] = true;

                pq.offer(new int[]{ newTime, newR, newC });

            }

        }
        
        return -1;

    }
}
