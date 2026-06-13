class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = Arrays.stream(nums)
                                        .boxed()
                                        .collect(Collectors.toSet());
        int longestConsecutive = 0;

        for (Integer v : set) {
            int count = 1;
            int consecutive=1;

            if (!set.contains(v-1)) {
                while(set.contains(v + count++)) {
                    consecutive++;
                }
            }
            longestConsecutive = Math.max(longestConsecutive, consecutive);
        }

        return longestConsecutive;
    }
}