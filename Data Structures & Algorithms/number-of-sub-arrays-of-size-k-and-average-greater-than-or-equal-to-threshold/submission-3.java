class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int thres = threshold * k;
        int sum = 0;
        int l = 0;
        int count = 0;
        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];
            if (r - l + 1 >= k) {
                if (sum >= thres)
                    count++;
                sum -= arr[l];
                l++;
            }
        }
        return count;
    }
}