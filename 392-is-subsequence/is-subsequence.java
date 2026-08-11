class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s == null) return true;

        int sLen = s.length(), tLen = t.length();

        if (sLen > tLen) return false;

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