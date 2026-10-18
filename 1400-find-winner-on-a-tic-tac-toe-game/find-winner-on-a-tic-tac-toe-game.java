class Solution {
    public String tictactoe(int[][] moves) {
        
        char[][] board = new char[3][3];

        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int column = moves[i][1];

            board[row][column] = (i % 2 == 0) ? 'X' : 'O';
        }

        if (checkWin(board, 'X')) return "A";
        if (checkWin(board, 'O')) return "B";
        
        return moves.length == 9 ? "Draw" : "Pending";
    }

    boolean checkWin(char[][] board, char player) {
        // check winning condition Lines & collonnes
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // diagonles
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}