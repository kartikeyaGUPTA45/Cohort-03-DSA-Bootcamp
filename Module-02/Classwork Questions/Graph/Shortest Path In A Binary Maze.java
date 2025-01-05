import java.io.*;
import java.util.*;

public class Solution {
  
    public static class Triple {
      int row;
      int col;
      int dis;
      
      public Triple(int row, int col, int dis) {
        this.row = row;
        this.col = col;
        this.dis = dis;
      }
    }
  
    public static int shortestPath(int arr[][], int m, int n, int srcR, int srcC, int destR, int destC) {
      Queue<Triple> q = new LinkedList<>();
      int dist[][] = new int [m][n];
      
      for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
          dist[i][j] = (int)(1e9);
        }
      }
      
      dist[srcR][srcC] = 0;
      q.add(new Triple(srcR, srcC,0));
      
      int dRow [] = {-1,0,1,0};
      int dCol [] = {0,-1,0,1};
      
      while(q.size() > 0) {
        Triple t = q.remove();
        int row = t.row;
        int col = t.col;
        int dis = t.dis;
        
        for(int i=0;i<4;i++) {
          int nRow = row + dRow[i];
          int nCol = col + dCol[i];
          
          if (nRow >= 0 && nRow <m && nCol >= 0 && nCol < n && arr[nRow][nCol] == 1 && dist[nRow][nCol] > 1 + dis) {
            dist[nRow][nCol] = 1 + dis;
            if (nRow == destR && nCol == destC) {
              // return dist[nRow][nCol];
              return 1 + dis;
            }
            q.add(new Triple(nRow, nCol, dist[nRow][nCol]));
          }
        }
      }
      
      return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int m = scn.nextInt();
      int n = scn.nextInt();
      
      int arr[][] = new int[m][n];
      
      for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      int srcR = scn.nextInt();
      int srcC = scn.nextInt();
      int destR = scn.nextInt();
      int destC = scn.nextInt();
      
      System.out.println(shortestPath(arr,m,n,srcR,srcC,destR,destC));  
      
    }
}
