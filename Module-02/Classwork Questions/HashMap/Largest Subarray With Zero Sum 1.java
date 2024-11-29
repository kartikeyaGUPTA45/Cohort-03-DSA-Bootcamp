import java.io.*;
import java.util.*;

public class Solution {
    
    public static int largestSubarray(int arr[], int n) {
      int maxLen = 0,sum=0;
      
      HashMap<Integer, Integer> map = new HashMap<>();
      
      map.put(sum,-1);
      
      for(int i=0;i<n;i++) {
        sum+=arr[i];
        
        if (map.containsKey(sum)) {
          int len = i-map.get(sum);
          if (maxLen < len) {
            maxLen = len;
          }
          
        } else {
          map.put(sum,i);
        }
      }
      
      return maxLen;
      
    }
  

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      System.out.println(largestSubarray(arr,n));
    }
}
