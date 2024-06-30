import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPalindrome(String str) {
      int l = 0,r=str.length()-1;
      while(l<r) {
        char ch1 = str.charAt(l);
        char ch2 = str.charAt(r);
        
        if(ch1 != ch2) {
          return false;
        }
        
        l++;
        r--;
      }
      
      return true;
    }
  
    public static void palindromicSubstrings(String str) {
      for(int i=0;i<str.length();i++) {
        for(int j=i;j<str.length();j++) {
          String s = str.substring(i,j+1);
          
          if (isPalindrome(s)) {
            System.out.println(s);
          }
        }
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      
      palindromicSubstrings(str);
    
    }
}
