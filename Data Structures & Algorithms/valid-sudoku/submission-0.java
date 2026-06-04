class Solution {
    public boolean isValidSudoku(char[][] board) {        
        for(int i=0;i<9;i++)
        {
            HashSet<Character> col= new HashSet<>();
            HashSet<Character> row= new HashSet<>();
            for(int j=0;j<9;j++)
            {   
                if(board[i][j]!='.' && row.contains(board[i][j]))
                    return false;
                else 
                    row.add(board[i][j]);
                if(board[j][i]!='.' && col.contains(board[j][i]))
                    return false;
                else 
                    col.add(board[j][i]);
            }
        }        
        
        for(int boxNum=0;boxNum<9;boxNum++)
        {
            HashSet<Character> box= new HashSet<>();
            int startRow = (boxNum / 3) * 3;
            int startCol = (boxNum % 3) * 3;

            for(int i = startRow; i < startRow + 3; i++) {
                for(int j = startCol; j < startCol + 3; j++) {
                    if(board[i][j] != '.') {
                        if(box.contains(board[i][j]))
                        return false;
                    box.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}