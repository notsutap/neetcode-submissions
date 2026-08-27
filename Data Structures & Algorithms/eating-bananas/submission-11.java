class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1; int r = Integer.MIN_VALUE; int hours = h;
        for(int pile : piles) {
            r = Math.max(pile, r);
        }
        while(l < r) {
            int m = l + (r - l) / 2;
            if(question(m, piles, hours) == true) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
    private boolean question(int m, int[] piles, int hours) {
        int total = 0;
        for(int pile : piles) {
            total += (int)Math.ceil((double)pile / m);
            if(total > hours) return false;
        }
        return true;
    }
}
