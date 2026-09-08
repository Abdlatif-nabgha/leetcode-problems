class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Tracks the last seen index of each ASCII character (initialized to -1)
        int[] lastSeen = new int[128];
        java.util.Arrays.fill(lastSeen, -1);

        int maxLen = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char current = s.charAt(r);

            // If the character was seen inside the current window, jump 'l' past it
            if (lastSeen[current] >= l) {
                l = lastSeen[current] + 1;
            }

            // Update the last seen index of the current character
            lastSeen[current] = r;

            // Calculate max length
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}