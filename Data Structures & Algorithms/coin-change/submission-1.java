class Solution {
    private int[][] cache;
    public int coinChange(int[] coins, int amount) {
        cache = new int[coins.length + 1][amount + 1];
        for(int[] row : cache) {
            Arrays.fill(row, -1);
        }
        int res = dfs(0, coins, amount);
        if(res == Integer.MAX_VALUE) return -1; return res;
    }
    private int dfs(int i, int[] coins, int amount) {
        if(amount == 0) return 0;

        if(i == coins.length || amount < 0) return Integer.MAX_VALUE;

        if(cache[i][amount] != -1) return cache[i][amount];

        int skip = dfs(i + 1, coins, amount);

        int take = Integer.MAX_VALUE;
        
        int newAmt = amount - coins[i];
        if(newAmt >= 0) {
            int sub = dfs(i, coins, newAmt);
            if(sub != Integer.MAX_VALUE) {
                take = 1 + sub;
            }
        }
        cache[i][amount] = Math.min(skip, take);
        return cache[i][amount];
    }
}
