class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // step 1: count frequency of each number
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.merge(num, 1, Integer::sum);
        }

        // step 2: create bucket 
        // bucket[i] = numbers that appear i times
        List<Integer>[] buckets = new List[nums.length + 1];

        for (Map.Entry <Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(num);
        }

        // step 3: take elt from highest freq to lowerst
        int[] result = new int[k];
        int index = 0;

        for (int freq = buckets.length - 1; freq >= 0; freq--) {
            
            if (buckets[freq] == null) continue;

            for (int num : buckets[freq]) {
                result[index++] = num;

                if (index == k) return result;
            }

        }

        return result;
        
    }
}