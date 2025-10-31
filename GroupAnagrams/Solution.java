package GroupAnagrams;

import java.util.*;

public class Solution {
    /*
     * Group anagrams together using character frequency as key.
     * 
     * Time: O(m * n) where m = number of strings, n = length of longest string
     * Space: O(m) for the hash map storing all strings
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        /*
         * ["eat", "tea", "tan", "ate", "nat", "bat"]
         */
        for (String str : strs) {
            // Count character frequencies
            int[] counts = new int[26];
            for (char c : str.toCharArray()) {
                counts[c - 'a']++;
            }

            // Build unique key from character counts
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : counts) {
                keyBuilder.append('#');
                keyBuilder.append(count);
            }
            String key = keyBuilder.toString();

            // Add string to its anagram group
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(groups.values());
    }
}
