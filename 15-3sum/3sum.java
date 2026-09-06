class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        int len = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < len - 2; i++) {

            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            // initialize 2 pointers
            int l = i + 1, r = len - 1;
            
            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];
                
                if (sum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    while (l < r && nums[l] == nums[l-1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return triplets;
    }
}