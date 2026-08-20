class Solution {
    public void sortColors(int[] nums) {
        
        int[] counts = new int[3];

        // Pass 1: count occurrences
        for (int num : nums) {
            counts[num]++;
        }

        // Phase 2: 
        int index = 0;
        for (int color = 0; color < 3; color++) {
            for(int i = 0; i < counts[color]; i++) {
                nums[index] = color;
                index++;
            }
        }
    }
}