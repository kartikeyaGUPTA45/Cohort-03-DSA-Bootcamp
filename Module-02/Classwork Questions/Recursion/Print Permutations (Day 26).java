import java.io.*;
import java.util.*;

public class Solution {
  
    public static void pp(String str, String ans) {
      if (str.length() == 0) {
        System.out.println(ans);
        return;
      }
      
      
      for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        String ros = str.substring(0,i) + str.substring(i+1);
        pp(ros,ans + ch);
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      
      pp(str,"");
    }
}
