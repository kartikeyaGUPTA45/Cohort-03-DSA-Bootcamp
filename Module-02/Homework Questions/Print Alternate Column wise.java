import java.io.*;
import java.util.*;

public class Solution {
  
    public static void printAlternateColumn(int arr[][], int n, int m) {
      for(int j=0;j<m;j+=2) {
        for(int i=0;i<n;i++) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
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
      
      printAlternateColumn(arr,n,m);
    }
}
