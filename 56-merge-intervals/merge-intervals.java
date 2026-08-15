class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> mergedIntervals = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int[] current : intervals) {
            if (mergedIntervals.isEmpty()) {
                mergedIntervals.add(current);
            } else {
                int[] last = mergedIntervals.getLast();
                if (current[0] <= last[1]) {
                    last[1] = Math.max(last[1], current[1]);
                } else {
                    mergedIntervals.add(current);
                }
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}