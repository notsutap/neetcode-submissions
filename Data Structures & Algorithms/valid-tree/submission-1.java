class Solution {
    int count = 0;
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        if(!dfs(0, -1, visited, adj)) {
            return false;
        }
        return count == n;

    }

    public boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        if(visited[node]) {
            return false;
        }
        visited[node] = true;
        count++;
        for(int neighbour : adj.get(node)) {
            if(neighbour == parent) {
                continue;
            }
            if(!dfs(neighbour, node, visited, adj)) {
                return false;
            }
        }
        return true;
    }
}
