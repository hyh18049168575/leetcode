package leetcodeNumbers;

public class No419 {
    public static int countBattleships(char[][] board) {
        char [][] b = new char[board.length+1][board[0].length+1];
        for (int i = 0;i<board.length;i++){
            for (int j = 0;j<board[0].length;j++){
                b[i][j] = board[i][j];
            }
        }
        int a = 0;
        for (int i = 0;i<board.length;i++){
            for (int j = 0;j<board[0].length;j++){
                if (b[i][j] == '.') continue;
                if (b[i][j] == 'X'){
                    if (board[i+1][j] == 'X' || board[i][j+1] == 'X')continue;
                    else {
                        a++;
                    }
                }
            }
        }
        return a;
    }
    public static int countBattleships1(char[][] board) {
        int m = board.length, n = board[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && board[i - 1][j] == 'X') continue;
                if (j > 0 && board[i][j - 1] == 'X') continue;
                if (board[i][j] == 'X') ans++;
            }
        }
        return ans;
    }
}
