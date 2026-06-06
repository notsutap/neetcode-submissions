class Solution {
    public int maxTurbulenceSize(int[] arr) {
        String prev = "";
        int r = 1;
        int l = 0;
        int maxLen = 1;
        while(r < arr.length) {
            if(arr[r - 1] < arr[r] && !prev.equals("<")) {
                maxLen = Math.max(r - l + 1, maxLen);
                r++;
                prev = "<";
            } else if(arr[r-1] > arr[r] && !prev.equals(">")) {
                maxLen = Math.max(r - l + 1, maxLen);
                r++;
                prev=">";
            } else {
                // maxLen = Math.max(r - l + 1, maxLen);
                if(arr[r - 1] == arr[r]) r++;
                l = r - 1;
                prev="";
            }
            
        }
        return maxLen;
    }
}