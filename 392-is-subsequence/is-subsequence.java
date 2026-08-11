class Solution {
    public boolean isSubsequence(String s, String t) {

        int sLen = s.length(), tLen = t.length();

        int i = 0, j= 0;

        while (j < tLen && i < sLen) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == sLen;
    }
}