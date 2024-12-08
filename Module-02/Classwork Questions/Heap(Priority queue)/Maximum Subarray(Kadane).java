import java.io.*;
import java.util.*;

public class Solution {
  
    public static int maximumSubarray(int arr[], int n) {
      int currSum = arr[0], maxSum = arr[0];
      
      for(int i=1;i<n;i++) {
        if (currSum >= 0) {
          currSum += arr[i];
        } else {
          currSum = arr[i];
        }
        
        if (currSum > maxSum) {
          maxSum = currSum;
        }
      }
      
      return maxSum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      System.out.println(maximumSubarray(arr,n));
    }
}
