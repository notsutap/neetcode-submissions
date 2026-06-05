class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int j = nums2.length - 1;
        // int i = nums1.length - j - 2;
        // int last = nums1.length - 1;

        int i = m - 1;
        int j = n - 1;
        int last = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) {
                nums1[last] = nums1[i];
                i--;
            } else {
                nums1[last]= nums2[j];
                j--;
            }
            last--;
        }

        while(j >= 0) {
            nums1[last] = nums2[j];
            j--;
            last--;
        }
    }
}