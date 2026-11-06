public class Solution {

    public boolean isPalindrome(String inputString) {
        int start = 0;
        int end = inputString.length() - 1;

        while (start < end) {
            // avancer jusqu'à une lettre
            while (start < end && !isLetter(inputString.charAt(start))) {
                start++;
            }
            // reculer jusqu'à une lettre
            while (start < end && !isLetter(inputString.charAt(end))) {
                end--;
            }

            if (toLower(inputString.charAt(start)) != toLower(inputString.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + ('a' - 'A'));
        }
        return c;
    }
}