class Solution {

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (board[i][j] == word.charAt(0)) {
                    if (search(board, word, i, j, 0, visited))
                        return true;
                }
            }
        }

        return false;
    }

    public boolean search(char[][] board,String word,int i,int j,int index,boolean[][] visited) {
        if (i >= board.length || j >= board[0].length ||
            i < 0 || j < 0)
            return false;
        if (visited[i][j])
            return false;
        if (board[i][j] != word.charAt(index))
            return false;
        if (index == word.length() - 1)
            return true;
        visited[i][j] = true;
        boolean found =
            search(board, word, i, j + 1, index + 1, visited) ||search(board, word, i + 1, j, index + 1, visited) ||search(board, word, i - 1, j, index + 1, visited) ||search(board, word, i, j - 1, index + 1, visited);
        visited[i][j] = false;
        return found;
    }
}