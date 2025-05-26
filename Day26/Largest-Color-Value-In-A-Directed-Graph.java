class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        int[][] count = new int[n][26]; // dp table
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            indegree[edge[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.offer(i);
        }

        int max = 0, visited = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            visited++;
            int colorIndex = colors.charAt(node) - 'a';
            count[node][colorIndex]++;
            max = Math.max(max, count[node][colorIndex]);

            for (int neighbor : graph.get(node)) {
                for (int i = 0; i < 26; i++) {
                    count[neighbor][i] = Math.max(count[neighbor][i], count[node][i]);
                }

                indegree[neighbor]--;
                if (indegree[neighbor] == 0)
                    q.offer(neighbor);
            }
        }

        return visited == n ? max : -1;
    }
}
