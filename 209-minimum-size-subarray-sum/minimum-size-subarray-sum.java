class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int l = 0, sum = 0, result = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {

            sum += nums[r];

            while (sum >= target) {
                result = Math.min(result, r - l + 1);
                sum -= nums[l++];
            }

        }

        if (result == Integer.MAX_VALUE) return 0;

        return result;
    }
}