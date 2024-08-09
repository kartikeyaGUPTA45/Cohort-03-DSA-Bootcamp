import java.io.*;
import java.util.*;

public class Solution {
    public static void displayArray(int arr[], int n, int idx) {
      
      if (idx == n) {
        return;
      }
      
      System.out.println(arr[idx]);
      displayArray(arr, n, idx+1);
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int [n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      displayArray(arr,n,0);
    }
}
