class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : invocations) {
            graph.get(edge[0]).add(edge[1]);
        }
        boolean[] bad = new boolean[n];
        dfs(k, graph, bad);
        for (int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];
            if (!bad[u] && bad[v]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!bad[i]) {
                ans.add(i);
            }
        }
       return ans;
    }
    private void dfs(int node,
                     List<List<Integer>> graph,
                     boolean[] bad) {
        if (bad[node]) return;
        bad[node] = true;
        for (int next : graph.get(node)) {
            dfs(next, graph, bad);
        }
    }
}