class Solution {
    public String longestCommonPrefix(String[] strs) {
        

        //  Handle empty input array safely
        if (strs == null || strs.length == 0) return "";
        
        
        StringBuilder prefix = new StringBuilder(strs[0]);

        int length = strs.length;


       for (int i = 1; i < length; i++) {
            
            while (!strs[i].startsWith(prefix.toString())) {

                if (prefix.length() == 0) return "";

                prefix.deleteCharAt(prefix.length() - 1);
            }
       }

        return prefix.toString();
    }
}