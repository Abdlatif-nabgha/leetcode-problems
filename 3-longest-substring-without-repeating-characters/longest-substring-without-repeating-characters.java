class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // bacabcbb     
        int maxLength = 0;
        Map<Character, Integer> visitedCharacters = new HashMap<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentCharacter = s.charAt(right);
            
            if (visitedCharacters.containsKey(currentCharacter) && visitedCharacters.get(currentCharacter) >= left) {
                left = visitedCharacters.get(currentCharacter) + 1;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
            visitedCharacters.put(currentCharacter, right);
        }
        return maxLength;
    }
}