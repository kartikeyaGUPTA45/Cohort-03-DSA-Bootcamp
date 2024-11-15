import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static int countGoodSubstrings(String str) {
      int count =0, i=0,j=0;
      
      while(j<str.length()) {
        if (j-i+1 == 3) {
          char ch1 = str.charAt(i);
          char ch2 = str.charAt(i+1);
          char ch3 = str.charAt(i+2);
          
          if (ch1 != ch2 && ch2 != ch3 && ch3 != ch1) {
            count++;
          }
          i++;
        }
        j++;
      }
      
      return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      
      System.out.println(countGoodSubstrings(str));
    }
}
