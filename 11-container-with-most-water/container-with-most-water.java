class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;

        int maxWater = 0;

        while (l < r) {
            maxWater = Math.max( Math.min(heights[l], heights[r]) * (r-l), maxWater);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }

        }

        return maxWater;
    }
}
