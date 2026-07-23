class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right=piles[0];

        for (int i = 1; i < piles.length; i++) {
            right = Math.max(right, piles[i]);
        }

        int k = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours +=  Math.ceil((double)piles[i] / mid);
            }
            if (hours <= h) {
                k = Math.min(k, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return k;
    }
}