class Solution {
    public int[] replaceElements(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            max = arr[i + 1];
            for (int j = i + 1; j < arr.length - 1; j++) {
                if(arr[j] < arr[j + 1]) {
                    max = Math.max(max, arr[j + 1]);
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}