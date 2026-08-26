class Solution {
    int[][] cache;
    public int maximumProfit(List<Integer> profit, List<Integer> weight, int capacity) {
        cache = new int[profit.size()][capacity + 1];
        for(int[] row : cache) {
            Arrays.fill(row, -1);
        }
        return dfs(0, profit, weight, capacity);
    }
    private int dfs(int i, List<Integer> profit, List<Integer> weight, int capacity) {
        if(i == profit.size()) {
            return 0;
        }
        if(cache[i][capacity] != -1) {
            return cache[i][capacity];
        }
        int skip = dfs(i + 1, profit, weight, capacity);
        int take = 0;
        int newCap = capacity - weight.get(i);
        if(newCap >= 0) {
            take = profit.get(i) + dfs(i, profit, weight, newCap);
        }
        cache[i][capacity] = Math.max(skip, take);
        return cache[i][capacity];
    }
}
