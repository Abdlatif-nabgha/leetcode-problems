class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        int n = words.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private boolean isPrefixAndSuffix(String str1, String str2) {
        // str1 cannot be a prefix/suffix if it is longer than str2
        if (str1.length() > str2.length()) {
            return false;
        }
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}
