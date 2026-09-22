class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // check the length of 2 arrays odd or even
        
        int m = nums1.length, n = nums2.length;
        int[] nums = new int[n+m];
        int i = 0, j = 0, k = 0;
        // copy all elements to the nums array
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        while (i < m)
            nums[k++] = nums1[i++];
        while (j < n)
            nums[k++] = nums2[j++];
        boolean isOdd = (m + n) % 2 == 1;
        int middle = (m + n) / 2;
        if (isOdd) {
           return nums[middle];
        } else {
            return (nums[middle] + nums[middle - 1]) / 2.0;
        }
        
    }
}