class Solution {

    public class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public void bfs(int row, int col, char[][] grid, int vis[][]) {
        vis[row][col] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));

        int dr [] = {-1,0,1,0};
        int dc [] = {0,-1,0,1};

        while(q.size() > 0) {
            Pair p = q.remove();
            // all the 4 directions
            for(int d=0;d<4;d++) {
                int nrow = p.row + dr[d];
                int ncol = p.col + dc[d];

                if (nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol] = 1;
                }
            }
        }
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
                    bfs(i,j,grid,vis);
                }
            }
        }
        return count;  
    }
}

// 5 mins coding + 7 mins dry run
