class Solution {
    public int reverse(int x) {
        
        boolean isNegative = false;
        long val;
        if (x < 0) {
            isNegative = true;
            val = - ((long) x);
        } else {
            val = x;
        }

        StringBuilder sb = new StringBuilder(String.valueOf(val));
        sb.reverse();

        long reversed = Long.parseLong(sb.toString()) * (isNegative ? -1 : 1);

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
          return 0;
        }

        return isNegative ? Integer.parseInt(sb.toString()) * (-1) :
                            Integer.parseInt(sb.toString());
    }
}