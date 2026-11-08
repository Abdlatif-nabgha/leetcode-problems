class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] freqRansomNote = new int[26];
        int[] freqMagazine = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            freqRansomNote[c-'a']++;
        }

         for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            freqMagazine[c-'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freqRansomNote[i] > freqMagazine[i]) return false;
        }

        return true;
    }
}