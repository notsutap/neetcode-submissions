class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int speed = 1; int u = 0;
        for (int pile : piles) {
            u = Math.max(pile, u);
        }
        int l = 1; int res = u;
        while (l <= u) {
            long total = 0;
            int m = l + (u - l) / 2;
            for (int pile : piles) {
                total += (int) Math.ceil((double) pile / m);
            }
            if (total > h)
                l = m + 1;
            else {
                res = m;
                u = m - 1;
            }
        }
        return res;
    }
}
