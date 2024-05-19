import java.io.*;
import java.util.*;

public class Solution {
  
    public static int firstOccurence(int arr[], int d) {
      for(int i=0;i<arr.length;i++) {
        if (arr[i] == d) {
          return i;
        }
      }
      
      return -1;
    }
  
    public static int lastOccurence(int arr[], int d) {
//       int lastIndex = -1;
//       for(int i=0;i<arr.length;i++) {
//         if (arr[i] == d) {
//           lastIndex = i;
//         }
//       }
      
//       return lastIndex;
      
      for(int i=arr.length-1;i>=0;i--) {
        if(arr[i] == d) {
          return i;
        }
      }
      
      return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      int d =scn.nextInt();
      
      int firstIndex = firstOccurence(arr,d);
      int lastIndex = lastOccurence(arr,d);
      
      System.out.println(firstIndex);
      System.out.println(lastIndex);
    }
}
