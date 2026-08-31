class Solution {
    public int firstUniqChar(String s) {
        
        int[] freq = new int[26];
        
        // step 1: count all occurences for each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        
        // step 2: find the first non-repeating char 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch-'a'] == 1) return i;
        }
        
        return -1;
    }
}