import java.io.*;
import java.util.*;

public class Solution {
  
    public static void kt(int chessboard[][], int r, int c, int steps) {
      if (r < 0 || c < 0 || r>=chessboard.length || c >= chessboard.length || chessboard[r][c] > 0) {
        return;
      }
      
      if (steps == chessboard.length*chessboard.length) {
        chessboard[r][c] = steps;
        displayBoard(chessboard);
        chessboard[r][c] = 0;
        return;
      }
      
      chessboard[r][c] = steps;
      kt(chessboard, r-2,c+1,steps+1);
      kt(chessboard, r-1,c+2,steps+1);
      kt(chessboard, r+1,c+2,steps+1);
      kt(chessboard, r+2,c+1,steps+1);
      kt(chessboard, r+2,c-1,steps+1);
      kt(chessboard, r+1,c-2,steps+1);
      kt(chessboard, r-1,c-2,steps+1);
      kt(chessboard, r-2,c-1,steps+1);
      chessboard[r][c] = 0;
      
    }
    
    public static void displayBoard(int chessboard[][]) {
      for(int i=0;i<chessboard.length;i++) {
        for(int j=0;j<chessboard.length;j++) {
          System.out.print(chessboard[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int r = scn.nextInt();
      int c = scn.nextInt();
      
      int chessboard[][] = new int[n][n];
      kt(chessboard,r,c,1);
    }
}
