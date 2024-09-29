import java.io.*;
import java.util.*;

public class Solution {
    
    public static String updateString(String str) {
      StringBuilder sb = new StringBuilder();
      
      for(int i=0;i<str.length();i++) {
        char ch =str.charAt(i);
        if (ch == '#') {
          if (sb.length() > 0) {
            sb.deleteCharAt(sb.length()-1);
          }
        } else {
          sb.append(ch);
        }
      }
      
      return sb.toString();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String s = scn.next();
      String t = scn.next();
      
      String updatedS = updateString(s);
      String updatedT = updateString(t);
      
      if (updatedS.equals(updatedT)) {
        System.out.println(true);
      } else {
        System.out.println(false);
      }
    }
}
