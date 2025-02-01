import java.io.*;
import java.util.*;

public class Solution {
    public static int atmost(int arr[], int n, int k) {
      int i=0,j=0,ans = 0;
      HashMap<Integer,Integer> map = new HashMap<>();
      
      while(i<n) {
        int val = map.getOrDefault(arr[i],0);
        if (val == 0) k--;
        map.put(arr[i], val+1);
        
        while(k<0) {
          map.put(arr[j], map.get(arr[j])-1);
          if (map.get(arr[j]) == 0) k++;
          j++;
        }
        
        ans += (i-j);
        i++;
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
      
      int k = scn.nextInt();
      
      int ans1 = atmost(arr,n,k);
      int ans2 = atmost(arr,n,k-1);
      
      System.out.println(ans1 - ans2);
    }
}
