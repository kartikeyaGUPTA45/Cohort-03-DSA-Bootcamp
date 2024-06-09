import java.io.*;
import java.util.*;

public class Solution {
    public static void matrixMultiplication(int a1[][], int a2[][]) {
      int r1 = a1.length;
      int c1 = a1[0].length;
      
      int r2 = a2.length;
      int c2 = a2[0].length;
      
      if (c1 != r2) {
        System.out.println("Invalid input");
        return;
      }
      
      int ans [][] = new int[r1][c2];
      for(int i=0;i<r1;i++) {
        for(int j=0;j<c2;j++) {
          for(int k=0;k<c1;k++) {
            ans[i][j] += (a1[i][k] * a2[k][j]);
          }
        }
      }
      
      for(int i=0;i<r1;i++) {
        for(int j=0;j<c2;j++) {
          System.out.print(ans[i][j] + " ");
        }
        System.out.println();
      }
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int m1 = scn.nextInt();
      
      int a1[][] = new int[n1][m1];
      
      for(int i=0;i<n1;i++) {
        for(int j=0;j<m1;j++) {
          a1[i][j] = scn.nextInt();
        }
      }
      
      int n2 = scn.nextInt();
      int m2 = scn.nextInt();
      
      int a2[][] = new int[n2][m2];
      for(int i=0;i<n2;i++) {
        for(int j=0;j<m2;j++) {
          a2[i][j] = scn.nextInt();
        }
      }
      
      matrixMultiplication(a1,a2);
    }
}
