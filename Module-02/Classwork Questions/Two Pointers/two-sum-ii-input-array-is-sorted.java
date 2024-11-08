import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static void sumTarget(int arr[], int n, int target) {
      int i=0,j=n-1;
      
      while(i<j) {
        int sum = arr[i] + arr[j];
        
        if (sum == target) {
          System.out.print((i+1) + " " + (j+1));
          return;
        } else if (sum < target) {
          i++;
        } else {
          j--;
        }
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
      
      int tar = scn.nextInt();
      
      sumTarget(arr,n, tar);
    }
}
