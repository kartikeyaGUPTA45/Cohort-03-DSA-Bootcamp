import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  (5+ 10) coding + dry run 
    public static int maxArea(int arr[], int n) {
      int ans = Integer.MIN_VALUE, i=0,j=n-1;
      
      while(i<j) {
        int minHt = Math.min(arr[i], arr[j]);
        int tempArea = minHt * (j-i);
        
        if (ans < tempArea) {
          ans = tempArea;
        }
        
        if (arr[i] < arr[j]) {
          i++;
        } else {
          j--;
        }
      }
      
      return ans;
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      System.out.println(maxArea(arr,n));
    }
}
