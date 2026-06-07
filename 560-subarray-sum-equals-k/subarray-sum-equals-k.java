class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int length = nums.length;
        int totalNumberSubArrays = 0;

        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // somme 0 vue 1 fois (avant de commencer)
    
        int sum = 0;

        for (int num : nums) {
            sum += num;
            totalNumberSubArrays += prefixCount.getOrDefault(sum - k, 0);
            prefixCount.merge(sum, 1, Integer::sum);
        }
        return totalNumberSubArrays;
    }
}