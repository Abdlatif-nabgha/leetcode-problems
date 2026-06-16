class Solution {

    public long maximumSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        long windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            freq.merge(nums[i], 1, Integer::sum);
        }

        long largest = (freq.size() == k) ? windowSum : 0;

        for (int right = k; right < nums.length; right++) {
            int left = right - k;

            windowSum -= nums[left];
            freq.compute(nums[left], (key, count) -> count == 1 ? null : count - 1);

            windowSum += nums[right];
            freq.merge(nums[right], 1, Integer::sum);

            if (freq.size() == k) {
                largest = Math.max(largest, windowSum);
            }
        }

        return largest;
    }
}