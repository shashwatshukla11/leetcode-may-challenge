class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
        int n = edges1.length + 1, m = edges2.length + 1;

        // Coloring based on even/odd depth
        int[] color1 = new int[n];
        int[] color2 = new int[m];

        // Get count of even and odd depth nodes
        int[] count1 = build(edges1, color1);
        int[] count2 = build(edges2, color2);

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            // Node i in tree1 gets count of its parity in tree1 + max possible from tree2
            res[i] = count1[color1[i]] + Math.max(count2[0], count2[1]);
        }

        return res;
    }

    private int[] build(int[][] edges, int[] color) {
        int n = edges.length + 1;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // Run DFS to assign even/odd colors
        int evenCount = dfs(0, -1, 0, adj, color);
        return new int[]{evenCount, n - evenCount}; // [even, odd]
    }

    private int dfs(int node, int parent, int depth, List<List<Integer>> adj, int[] color) {
        color[node] = depth % 2;
        int even = (depth % 2 == 0) ? 1 : 0;

        for (int neighbor : adj.get(node)) {
            if (neighbor != parent) {
                even += dfs(neighbor, node, depth + 1, adj, color);
            }
        }

        return even;
    }
}
