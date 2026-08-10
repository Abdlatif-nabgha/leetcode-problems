class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int word1Length = word1.length(), word2Length = word2.length();
        int i = 0, j = 0;

        while (i < word1Length && j < word2Length) {
            sb.append(word1.charAt(i++)).append(word2.charAt(j++));
        }
        while (i < word1Length) sb.append(word1.charAt(i++));
        while (j < word2Length) sb.append(word2.charAt(j++));

        return sb.toString();
    }
}