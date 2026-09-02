class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) return 0;
        
        int l = 0, sum = 1, res = 0;

        for (int r = 0; r < nums.length; r++) {
            
            sum *= nums[r];

            while (sum >= k) {
                sum /= nums[l++];
            }

            if (sum < k) {
                res += r - l + 1;
            } 
        }

        return res;
    }
}