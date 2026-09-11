class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxOnes = 0, counter = 0;

        for (int num : nums) {
            if (num == 0) {
                counter = 0;
            } else {
                counter++;
                maxOnes = Math.max(maxOnes, counter);
            }
        }

        return maxOnes;
    }
}