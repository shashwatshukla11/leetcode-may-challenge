class Solution {
    static final int MOD = 1_000_000_007;
    public int colorTheGrid(int m, int n) {
        List<Integer> states = new ArrayList<>();
        generateStates(0, -1, m, 0, states);
        Map<Integer, List<Integer>> neighbors = new HashMap<>();

        for (int a : states) {
            neighbors.putIfAbsent(a, new ArrayList<>());
            for (int b : states) {
                if (isCompatible(a, b, m)) {
                    neighbors.get(a).add(b);
                }
            }
        }

        Map<Integer, Integer> dp = new HashMap<>();
        for (int state : states) {
            dp.put(state, 1);
        }

        for (int col = 1; col < n; col++) {
            Map<Integer, Integer> newDp = new HashMap<>();
            for (int curr : states) {
                for (int prev : neighbors.get(curr)) {
                    newDp.put(curr, (newDp.getOrDefault(curr, 0) + dp.get(prev)) % MOD);
                }
            }
            dp = newDp;
        }

        int total = 0;
        for (int count : dp.values()) {
            total = (total + count) % MOD;
        }
        return total;
    }

    void generateStates(int pos, int lastColor, int m, int state, List<Integer> states) {
        if (pos == m) {
            states.add(state);
            return;
        }
        for (int color = 0; color < 3; color++) {
            if (color != lastColor) {
                generateStates(pos + 1, color, m, state * 3 + color, states);
            }
        }
    }

    boolean isCompatible(int a, int b, int m) {
        for (int i = 0; i < m; i++) {
            if (a % 3 == b % 3) return false;
            a /= 3;
            b /= 3;
        }
        return true;
    }
}
