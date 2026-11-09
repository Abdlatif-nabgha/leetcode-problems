class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // step 1: count frequency of each number
        Map<Integer, Integer> count = new HashMap<>();
        int[] result = new int[k];

        for (int num : nums) {
            count.merge(num, 1, Integer::sum);
        }

        // {1: 3, 2: 2, 3: 1}
        Map<Integer, Integer> sortedMap = count.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue, 
                (e1, e2) -> e1, 
                LinkedHashMap::new 
            ));
        int counter = 0;
        for ( Map.Entry<Integer, Integer> entry : sortedMap.entrySet() ) {
            if (counter == k ) {
                break;
            }
            result[counter++] = entry.getKey();
        }

        return result;
        
    }
}