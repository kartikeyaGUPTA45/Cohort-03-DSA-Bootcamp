import java.io.*;

import java.util.*;

public class Solution {
    public static String longestCommonPrefix(String [] arr, int n) {
      
      // Find the miniumum length string
      int len = Integer.MAX_VALUE;
      for(int i=0;i<n;i++) {
        int tempLen = arr[i].length();
        if (tempLen < len) {
          len = tempLen;
        }
      }
      
      String ans = "";
      
      for(int i=0;i<len;i++) {
        char ch = arr[0].charAt(i);
        int flag = 0;
        for(int j=1;j<n;j++) {
          if (ch != arr[j].charAt(i)) {
            flag = 1;
            break;
          }
        }
        
        if (flag == 0) {
          ans += ch;
        }
      }
      
      return ans;
      
    }

    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      String [] arr = new String [n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.next();
      }
      
      System.out.println(longestCommonPrefix(arr,n));

    }

}
