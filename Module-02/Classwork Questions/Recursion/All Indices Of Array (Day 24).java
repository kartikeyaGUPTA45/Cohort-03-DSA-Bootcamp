import java.io.*;
import java.util.*;

public class Solution {
  
    public static int [] allIndices(int arr[], int n, int x, int idx, int count) {
      if (idx == n) {
        int base [] = new int[count];
        return base;
      }
      
      int ans [];
      if (arr[idx] == x) {
        ans = allIndices(arr,n,x,idx+1,count+1);
        ans[count] = idx;
      } else {
        ans = allIndices(arr,n,x,idx+1,count);
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
      
      int x = scn.nextInt();
      
      int ans [] = allIndices(arr,n,x,0,0);
      
      for(int i=0;i<ans.length;i++) {
        System.out.println(ans[i]);
      }
    }
}
