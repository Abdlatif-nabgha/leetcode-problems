class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Frequency = new int[26];
        int[] s2Frequency = new int[26];

        int s1Length = s1.length(); 
        
        for (int i = 0; i < s1Length; i++) {
            char ch = s1.charAt(i);
            s1Frequency[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            

            char ch = s2.charAt(right);
            // 1. Add the new character entering the sliding window
            s2Frequency[ch - 'a']++;

            // 2. If the window exceeds s1's length, shrink the window from the left
            if (right - left + 1 > s1Length) {
                s2Frequency[s2.charAt(left) - 'a']--;
                left++;
            }  

            // 3. Once the window is the correct size, compare the frequency arrays
            if (right - left + 1 == s1Length) {
                if (Arrays.equals(s1Frequency, s2Frequency)) {
                    return true;
                }
            }
        }
        return false;
    }
}