class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();

        int l = 0, maxLen = 0;

        for (int r = 0; r < s.length(); r++) {

            char current = s.charAt(r);

            while (set.contains(current)) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(current);

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}