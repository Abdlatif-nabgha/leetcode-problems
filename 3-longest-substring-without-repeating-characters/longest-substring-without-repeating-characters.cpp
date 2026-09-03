class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if ( s == "") return 0;
        int n = s.size();
        unordered_set<int> charSet;
    
        int left = 0;
        int maxSubstring = charSet.size();
        for (int right = 0 ; right < n ; right++){
            while (charSet.contains(s[right])){
                charSet.erase(s[left]);
                left++;
                }
            
            charSet.insert(s[right]);
            int m = charSet.size();
            maxSubstring = max(maxSubstring , m);
            
        }
        return maxSubstring; 
    }
};

// abcbcbb