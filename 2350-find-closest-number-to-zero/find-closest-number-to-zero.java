class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int num : nums) {
            int distance = Math.abs(num);
            if (distance < Math.abs(closest)) {
                closest = num;
            } else if (distance == Math.abs(closest) && num >= closest) {
                closest = num;
            }
        }
        return closest;
    }
}