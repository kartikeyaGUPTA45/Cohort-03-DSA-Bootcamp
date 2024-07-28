import java.io.*;
import java.util.*;

public class Solution {
    
    public static void floodFill(int sr,int sc, int dr, int dc, String ans, int arr[][], boolean visited [][]) {
      
      if (sr <0 || sc < 0 || sr > dr || sc > dc || arr[sr][sc] == 1 || visited[sr][sc] == true) {
        return ;
      }
      
      if (sr == dr && sc == dc) {
        System.out.println(ans);
        return ;
      }
      
      
      visited[sr][sc] = true;
      floodFill(sr-1,sc,dr,dc,ans + "t", arr,visited); // top 
      floodFill(sr,sc-1,dr,dc,ans + "l", arr,visited); // left
      floodFill(sr+1,sc,dr,dc,ans + "d", arr,visited); // down
      floodFill(sr,sc+1,dr,dc,ans + "r", arr,visited); // right
      visited[sr][sc] = false;
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
      
      boolean visisted[][] = new boolean[n][m];
      
      floodFill(0,0,n-1,m-1,"",arr,visisted);
    }
}
