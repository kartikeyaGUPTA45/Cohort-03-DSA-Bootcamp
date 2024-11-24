import java.io.*;
import java.util.*;

public class Solution {
  
    public static boolean checkPairs(int arr[], int n, int k) {
      HashMap<Integer, Integer> map = new HashMap<>();
      
      for(int i=0;i<n;i++) {
        int rem = arr[i]%k;
        
        map.put(rem,map.getOrDefault(rem,0)+1);
      }
      
      
      for(int i=0;i<n;i++) {
        int rem = arr[i]%k;
        
        if (rem == 0) {
          if(map.get(rem)%2 != 0) {
            return false;
          }
        } else if (2*rem == k) {
          if (map.get(rem) %2 != 0) {
            return false;
          }
        } else {
          int rem2 = k-rem;
          
          if (map.get(rem) != map.get(rem2)) {
            return false;
          }
        }
      }
      
      return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      int k = scn.nextInt();
      
      System.out.println(checkPairs(arr,n,k));
    }
}
