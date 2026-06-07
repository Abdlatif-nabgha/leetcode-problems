class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int length = nums.length;
        int totalNumberSubArrays = 0;

        // brute force solution
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = i; j < length; j++) {
                sum += nums[j];
                if (sum == k) {
                    totalNumberSubArrays++;
                }
            }
        }
        return totalNumberSubArrays;
    }
}