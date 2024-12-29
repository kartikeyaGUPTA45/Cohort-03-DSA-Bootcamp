import java.io.*;
import java.util.*;

public class Solution {
    
    public static class Triple {
      int row;
      int col;
      int time;
      
      public Triple(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
      }
    }
  
    public static int rottenOranges(int arr[][], int n, int m) {
      Queue<Triple> q = new LinkedList<>();
      int cnt = 0;
      for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
          if (arr[i][j] == 1) {
            cnt++;
          } else if(arr[i][j] == 2) {
            q.add(new Triple(i,j,0));
          }
        }
      }
      
      
      int ans = 0;
      int dr[] = {-1,0,1,0};
      int dc[] = {0,-1,0,1};
      
      while(q.size() > 0) {
        Triple node = q.remove();
        
        ans = Math.max(ans,node.time);
        
        for(int d=0;d<4;d++) {
          int nrow = node.row + dr[d];
          int ncol = node.col + dc[d];
          
          if (nrow >= 0 && nrow < n && ncol >= 0 && ncol <  m && arr[nrow][ncol] == 1) {
            arr[nrow][ncol] = 2;
            q.add(new Triple(nrow,ncol,node.time+1));
            cnt--;
          }
        }
      }
      
      if (cnt == 0) return ans;
      return -1;
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      int arr[][] = new int[n][m];
      for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      System.out.println(rottenOranges(arr,n,m));
    }
}
