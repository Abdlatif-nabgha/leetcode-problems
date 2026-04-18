class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int length = heights.length;
        int i = 0;
        int j = length - 1;
        while (i != j) {
            int a = Math.min(heights[i], heights[j]);
            int amount = a * (j - i);
            if (amount > max) max = amount;
            if (heights[i] < heights[j]) i++;
            else j--;
        }
        return max;
    }
}
