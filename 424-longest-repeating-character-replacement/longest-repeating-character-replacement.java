class Solution {
    public int characterReplacement(String s, int k) {
        
        int l = 0;
        int maxLen = 0, mostFreq = 0;
        
        Map<Character, Integer> freq = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);
            freq.merge(ch, 1, Integer::sum);

            mostFreq = Math.max(mostFreq, freq.get(ch));

            if (r - l + 1 - mostFreq > k) {
                freq.computeIfPresent(s.charAt(l), (_, v) -> v - 1 == 0 ? null : v -1);
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        
        return maxLen;
    }
}