       return ans;
    }
    private void dfs(int node,
                     List<List<Integer>> graph,
                     boolean[] bad) {
        if (bad[node]) return;
        bad[node] = true;
        for (int next : graph.get(node)) {
            dfs(next, graph, bad);
        }
    }
}
