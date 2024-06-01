import java.io.*;
import java.util.*;

public class Solution {
  
   public static String compareTwoMatrices(int a1[][], int a2[][], int m1, int n1, int m2, int n2) {
     if (n1 != n2 || m1 != m2) {
       return "Not Same";
     }
     
     for(int i=0;i<m1;i++) {
       for(int j=0;j<n1;j++) {
         if (a1[i][j] != a2[i][j]) {
           return "Not Same";
         }
       }
     }
     
     return "Same";
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int m1 = scn.nextInt();
      int n1 = scn.nextInt();
      
      int a1[][] = new int[m1][n1];
      
      for(int i=0;i<m1;i++) {
        for(int j=0;j<n1;j++) {
          a1[i][j] = scn.nextInt();
        }
      }
      
      int m2 = scn.nextInt();
      int n2 = scn.nextInt();
      
      int a2[][] = new int [m2][n2];
      
      for(int i=0;i<m2;i++) {
        for(int j=0;j<n2;j++) {
          a2[i][j] = scn.nextInt();
        }
      }
      
      System.out.println(compareTwoMatrices(a1,a2,m1,n1,m2,n2));
        
    }
}
