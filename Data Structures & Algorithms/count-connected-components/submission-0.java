class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int res = 0;
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        for(int node = 0; node < n; node++) {
            if(!visited[node]) {
                dfs(node, adj, visited);
                res++;
            }
        }
        return res;
    }
    public void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        if(visited[node]) {
            return;
        }
        visited[node] = true;
        for(int neighbour : adj.get(node)) {
            dfs(neighbour, adj, visited);
        }
    }
}
