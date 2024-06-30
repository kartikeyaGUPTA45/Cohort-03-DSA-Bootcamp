import java.io.*;
import java.util.*;

public class Solution {
     
    public static String compression1(String str) {
      String ans = str.charAt(0) + "";
      
      for(int i=1;i<str.length();i++) {
        char ch = str.charAt(i);
        char lastChar = ans.charAt(ans.length()-1);
        
        if (lastChar != ch) {
          ans+=ch;
        }
      }
      
      return ans;
      
    }
  
  public static String compression2(String str) {
    String ans = str.charAt(0) + "";
    int count = 1;
    
    for(int i=1;i<str.length();i++) {
      char ch = str.charAt(i);
      char lastChar = ans.charAt(ans.length()-1);
      
      if (ch == lastChar) {
        count++;
      } else {
        if (count != 1) {
          ans += count;
        }
        ans+=ch;
        count=1;
      }
    }
    
    if (count != 1) {
      ans += count;
    }
    
    return ans;
  }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      
      System.out.println(compression1(str));
      System.out.println(compression2(str));
    }
}
