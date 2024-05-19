import java.io.*;
import java.util.*;

public class Solution {
   public static int findMaxOfAnArray(int arr[]) {
     int max = Integer.MIN_VALUE;
     
     for(int i=0;i<arr.length;i++) {
       if (arr[i] > max) {
         max = arr[i];
       }
     }
     
     return max;
   }
  
    public static int findMinOfAnArray(int arr[]) {
      int min = Integer.MAX_VALUE;
      
      for(int i=0;i<arr.length;i++) {
        if (min > arr[i]) {
          min = arr[i];
        }
      }
      
      return min;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      int max = findMaxOfAnArray(arr);
      int min = findMinOfAnArray(arr);
      
      int span = max - min;
      
      System.out.println(span);
      
      
    }
}
