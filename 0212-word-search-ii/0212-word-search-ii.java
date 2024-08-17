class Solution {
   class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null;
    }
     private void insert(TrieNode root, String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.word = word;
    }
        
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = new TrieNode();
        
        
        for (String word : words) {
            insert(root, word);
        }
        
        int n = board.length;
        int m = board[0].length;
        
        // Start DFS from each cell in the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dfs(board, i, j, root, result);
            }
        }
        
        return result;
    }
    
    private void dfs(char[][] board, int i, int j, TrieNode node, List<String> result) {
        char c = board[i][j];
        if (c == '#' || node.children[c - 'a'] == null) {
            return;
        }
        
        node = node.children[c - 'a'];
        if (node.word != null) {
            result.add(node.word);
            node.word = null; 
        }
        
        board[i][j] = '#';  
        
        if (i > 0) dfs(board, i - 1, j, node, result);
        if (j > 0) dfs(board, i, j - 1, node, result);
        if (i < board.length - 1) dfs(board, i + 1, j, node, result);
        if (j < board[0].length - 1) dfs(board, i, j + 1, node, result);
        
        board[i][j] = c;  
    }


}