class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentVal = getValue(s.charAt(i));

            // If a smaller value precedes a larger value, subtract it
            if (i + 1 < n && currentVal < getValue(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result;
    }

    // Helper method to keep the main logic clean
    private int getValue(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
