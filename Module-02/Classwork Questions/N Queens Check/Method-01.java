import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isQueenAttacking(int arr[][], int row, int col, int n) {
      // col -> after cell
      for(int i = row+1;i<n;i++) {
        if (arr[i][col] == 1) {
          return true;
        }
      }
      
      // col -> before cell
      for(int i=row-1;i>=0;i--) {
        if (arr[i][col] == 1) {
          return true;
        }
      }
      
      // row -> before cell
      for(int j=col-1;j>=0;j--) {
        if (arr[row][j] == 1) {
          return true;
        }
      }
      
      // row -> after cell
      for(int j=col+1;j<n;j++) {
        if(arr[row][j] == 1) {
          return true;
        }
      }
      
      // diagonal -> before cell
      for(int i=row-1,j=col-1;i>=0 && j>=0;j--,i--) {
        if (arr[i][j] == 1) {
          return true;
        }
      }
      
      // diagonal -> after cell
      for(int i=row+1,j=col+1;i<n&&j<n; i++,j++) {
        if(arr[i][j] == 1) {
          return true;
        }
      }
      
      // antidiagonal -> before cell
      for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++) {
        if(arr[i][j] == 1) {
          return true;
        }
      }
      
      //anti diagonal -> after cell
      for(int i=row+1,j=col-1;i<n && j>=0;i++,j--) {
        if(arr[i][j] == 1) {
          return true;
        }
      }
      
      return false;
      
    }
  
    public static String nQueenCheck(int arr[][], int n) {
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          if (arr[i][j] == 1) {
            if (isQueenAttacking(arr,i,j,n) == true) {
              return "Danger";
            }
          }
        }
      }
      
      return "N Queens";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[][] = new int[n][n];
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      System.out.println(nQueenCheck(arr,n));
    }
}
