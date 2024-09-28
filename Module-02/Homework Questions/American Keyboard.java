import java.io.*;
import java.util.*;

public class Solution {
  // alaska => ch = b
    public static boolean canBeTypedUsingRow(String str, String row) {
      for(int i=0;i<str.length();i++) {
        String ch = str.charAt(i) + "";
        if (!row.contains(ch)) {
          return false;
        }
      }
      
      return true;
    }
  
    public static boolean canBeTypedUsingRows(String str, String row) {
      for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        if (row.indexOf(ch) == -1) {
          return false;
        }
      }
      
      return true;
    }
  
    public static void americanKeyboard(String arr[]) {
      for(int i=0;i<arr.length;i++) {
        if(canBeTypedUsingRows(arr[i], "qwertyuiop") || canBeTypedUsingRows(arr[i], "asdfghjkl")
           ||canBeTypedUsingRows(arr[i], "zxcvbnm")) {
          System.out.print(arr[i] + " ");
        }
      }
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      String arr[] = new String[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.next();
      }
      
      americanKeyboard(arr);
    }
}
