class Solution {
    int[][] directions = {{+1,0},{0,+1},{-1,0},{0,-1}};
    int islands=0;
    int row;
    int column;
    public int numIslands(char[][] grid) {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    row=i;
                    column=j;
                    islands++;
                    grid[i][j]='0';
                    dfs(grid,row,column);
                    
                }
            }
        }
        return islands;
    }
    public void dfs(char[][] grid,int i,int j)
    {
        for(int k=0;k<4;k++)
        {
            if(i+directions[k][0]<grid.length && j+directions[k][1]<grid[0].length && i+directions[k][0]>=0 && j+directions[k][1]>=0 && grid[i+directions[k][0]][j+directions[k][1]]==('1'))
            {
                grid[i+directions[k][0]][j+directions[k][1]]='0';
                dfs(grid,i+directions[k][0],j+directions[k][1]);
            }

        }
        return;

    }
}
