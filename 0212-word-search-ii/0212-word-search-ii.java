class Solution {
     public boolean solve(char[][] board, int n, int m, int row, int col, String word, int i) {
        if (i == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= n || col >= m || board[row][col] != word.charAt(i)) {
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '*';
        boolean res = solve(board, n, m, row - 1, col, word, i + 1) ||
                      solve(board, n, m, row, col - 1, word, i + 1) ||
                      solve(board, n, m, row + 1, col, word, i + 1) ||
                      solve(board, n, m, row, col + 1, word, i + 1);
        board[row][col] = temp;
        return res;
    }
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res=new ArrayList<>();
        int n = board.length;
        int m = board[0].length;
         for(int k=0;k<words.length;k++){
            boolean found = false;
        for (int i = 0; i < n&& !found; i++) {
            for (int j = 0; j < m&& !found; j++) {
                if (solve(board, n, m, i, j, words[k], 0)) {
                   res.add(words[k]);
                   found=true;
                }
            }
        }}
        return res; 
    }
}