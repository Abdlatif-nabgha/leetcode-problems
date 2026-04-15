class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current_ch = board[i][j];
                if (current_ch != '.') {
                     if (!seen.add(current_ch + " found in row " + i) ||
                        !seen.add(current_ch + " found in column " + j) ||
                         !seen.add(current_ch + " found in sub box " + 
                                                            i/3 + "-" + j/3)) 
                        {
                            return false;
                        }
                }
           
            }
        }
        return true;
    }
}