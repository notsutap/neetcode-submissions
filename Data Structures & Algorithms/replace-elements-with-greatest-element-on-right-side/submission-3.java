class Solution {
    public int[] replaceElements(int[] arr) {
        int rightMax = -1;
        int currMax = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            currMax = arr[i];
            arr[i] = rightMax;
            rightMax = Math.max(rightMax, currMax);
        }
        return arr;
    }
}