import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printSub(String str, String ans) {
      if (str.length() == 0) {
         System.out.println(ans);
         return;
      }
      
      char ch = str.charAt(0);
      String ros = str.substring(1);
      
      printSub(ros,ans + ch);
      printSub(ros,ans);
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      
      printSub(str,"");
    }
}
