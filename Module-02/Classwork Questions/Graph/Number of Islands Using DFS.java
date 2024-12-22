class Solution {

    public void dfs(int row, int col, char[][] grid, int vis[][]) {

        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || 
            vis[row][col] == 1 || grid[row][col] == '0') {
                return;
        }

        vis[row][col] = 1;
        dfs(row-1,col,grid,vis);
        dfs(row,col-1,grid,vis);
        dfs(row,col+1,grid,vis);
        dfs(row+1,col,grid,vis);
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];
        int count = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if (vis[i][j] == 0 && grid[i][j] == '1')  {
                    count+=1;
                    dfs(i,j,grid,vis);
                }
            }
        }

        return count;
        
    }
}
