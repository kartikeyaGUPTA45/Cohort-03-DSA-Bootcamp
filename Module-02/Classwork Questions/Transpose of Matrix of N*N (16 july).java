import java.io.*;
import java.util.*;

public class Solution {
    public static void swap (int arr[][], int i, int j) {
      int temp = arr[i][j];
      arr[i][j] = arr[j][i];
      arr[j][i] = temp;
    }
  
    public static void transposeMatrix(int arr[][], int n) {
      for(int i=1;i<n;i++) {
        for(int j=0;j<i;j++) {
          swap(arr,i,j);
        }
      }
      
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
      transposeMatrix(arr,n);
    }
}
