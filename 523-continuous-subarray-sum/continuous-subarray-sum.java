class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // {5: 0, 1: 1, }
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int reminder = sum % k;
            
            if (map.containsKey(reminder)) {
                if (i - map.get(reminder) >= 2) {   // {2: 0, 4: 1, 1: 2, 0: 3,}
                    return true;
                }
            }
            else 
                map.put(reminder, i);
        }
        return false;

    }
}