class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int maxLen = 0, mostFreq = 0;
        
        int[] frequency = new int[26];

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';
            frequency[index]++;

            mostFreq = Math.max(mostFreq, frequency[index]);

            while ( (right - left + 1) - mostFreq > k ) {
                int leftIndex = s.charAt(left) - 'A';
                frequency[leftIndex]--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}