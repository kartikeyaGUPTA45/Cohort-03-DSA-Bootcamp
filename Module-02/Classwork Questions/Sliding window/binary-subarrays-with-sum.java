import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static int countSubArrays(int arr[], int goal, int n) {
      int count [] = new int[n+1];
      int psum = 0, ans = 0;
      
      count[0] = 1;
      
      for(int i=0;i<n;i++) {
        psum += arr[i];
        
        if (psum >= goal) {
          ans += (count[psum-goal]);
        }
        
        count[psum]++;
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
      
      int goal = scn.nextInt();
      
      System.out.println(countSubArrays(arr,goal,n));
    }
}
