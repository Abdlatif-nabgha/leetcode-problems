class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) 
                    return output;
            }
            output += strs[0].charAt(i);
        }
        return output;
    }
}