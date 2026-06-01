class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        threshold *= k;
        int sum = 0;
        int count = 0;
        int l = 0;
        for(int r = 0; r < arr.length; r++) {
            sum += arr[r];
            if(r >= k - 1) {
                if(sum >= threshold) {
                    count++;
                }
                sum -= arr[l];
                l++;
            }
            
        }
        return count;
    }
}