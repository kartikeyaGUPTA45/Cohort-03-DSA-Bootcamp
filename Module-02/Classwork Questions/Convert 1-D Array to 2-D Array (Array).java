import java.io.*;
import java.util.*;

public class Solution {
    public static int [][] convert1Dto2D(int arr[], int n, int p, int q) {
      int ans [][] = new int[p][q];
      int count =0;
      
      for(int i=0;i<p;i++) {
        for(int j=0;j<q;j++) {
          ans[i][j] = arr[count];
          count++;
        }
      }
      
      return ans;
    }
    
    public static void displayArray(int arr[][], int p, int q) {
      for(int i=0;i<p;i++) {
        for(int j=0;j<q;j++) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      int p = scn.nextInt();
      int q = scn.nextInt();
      
      int ans [][] = convert1Dto2D(arr,n,p,q);
      displayArray(ans,p,q);
      
    }
}
