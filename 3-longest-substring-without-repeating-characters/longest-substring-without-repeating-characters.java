class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();

        int l = 0, maxLen = 0, length = s.length();

        for (int r = 0; r < length; r++) {

            char current = s.charAt(r);

            while (set.contains(current)) { // abcbcbb
                set.remove(s.charAt(l));
                l++;
            }

            set.add(current);

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}