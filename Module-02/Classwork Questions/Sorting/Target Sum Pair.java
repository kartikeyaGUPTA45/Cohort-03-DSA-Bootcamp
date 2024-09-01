import java.io.*;
import java.util.*;

public class Solution {
  
    public static void targetSum(int arr[], int n, int target) {
      Arrays.sort(arr);
      
      int left = 0, right = n-1;
      
      while(left <right) {
        int sum = arr[left] + arr[right];
        
        if (sum < target) left++;
        else if (sum > target) right--;
        else {
          System.out.println(arr[left] + " " + arr[right]);
          left++;
          right--;
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
      
      int target = scn.nextInt();
      
      targetSum(arr,n, target);
    }
}
