class Solution {
    public int[] countBits(int n) {
        int count = 0;
        int[] res = new int[n + 1];
        int temp;
        res[0] = 0;
        for(int i = 1; i <= n; i++) {
            temp = i;
            count = 0;
            while(temp > 0) {
                if((temp & 1) == 1) {
                    count++;
                }
                temp >>= 1;
            }
            res[i] = count;
        }
        return res;
    }
}
