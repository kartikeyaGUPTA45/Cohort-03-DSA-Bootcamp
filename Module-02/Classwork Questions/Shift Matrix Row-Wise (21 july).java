import java.io.*;
import java.util.*;

public class Solution {
    
    public static void reverse(int arr[][], int row, int left, int right) {
        while(left<right) {
          int temp = arr[row][left];
          arr[row][left] = arr[row][right];
          arr[row][right] = temp;
          
          left++;
          right--;
        }
      
    }
    
    public static void shiftTheMatrix(int arr[][], int n, int k) {
      for(int i=0;i<n;i++) {
        reverse(arr,i,0,n-1);
        reverse(arr,i,0,k-1);
        reverse(arr,i,k,n-1);
      }
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
      
      int k = scn.nextInt();
      k-=1;
      
      shiftTheMatrix(arr,n,k);
      
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    
    }
}
