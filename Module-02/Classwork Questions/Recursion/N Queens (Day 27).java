import java.io.*;
import java.util.*;

public class Solution {
  
    public static boolean isSafePosition(boolean chessboard[][], int row, int col) {
       // d1 
      for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--) {
        if(chessboard[i][j] == true) {
          return false;
        }
      }
      
      // d2
      for(int i=row-1;i>=0;i--) {
        if (chessboard[i][col] == true) {
          return false;
        }
      }
      
      //d3 
      for(int i=row-1,j=col+1;i>=0 && j<chessboard.length; i--,j++) {
        if (chessboard[i][j] == true) {
          return false;
        }
      }
      
      return true;
    }
  
    public static void nqueen(boolean chessboard[][], int row, String ans) {
      
      if (row == chessboard.length) {
        System.out.println(ans + ".");
        return;
      }
      
      for(int col = 0;col<chessboard.length;col++) {
        if (isSafePosition(chessboard, row, col)) {
          chessboard[row][col] = true;
          nqueen(chessboard,row+1, ans + row + "-" + col + ", ");
          chessboard[row][col] = false;
        }
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      boolean chessboard[][] = new boolean[n][n];
      nqueen(chessboard,0,"");
    }
}
