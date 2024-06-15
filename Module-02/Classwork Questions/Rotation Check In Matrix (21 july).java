import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String rotationCheck(int arr[][], int n) {
      String str = "";
      
      for(int i=0;i<n;i++) {
        str += arr[0][i];
      }
      
      str = str + str;
      
      for(int i=1;i<n;i++) {
        String cur = "";
        for(int j=0;j<n;j++) {
          cur += arr[i][j];
        }
        
        if (str.indexOf(cur) == -1) {
          return "NO";
        }
      }
      
      return "YES";
    }
  
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[][] = new int[n][n];
      
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      System.out.println(rotationCheck(arr,n));
    
    }
}
