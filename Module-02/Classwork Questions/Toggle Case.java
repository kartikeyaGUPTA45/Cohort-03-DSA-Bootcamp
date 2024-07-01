import java.io.*;
import java.util.*;

public class Solution {
   public static StringBuilder toggleCase(String str) {
     StringBuilder sb = new StringBuilder();
     for(int i=0;i<str.length();i++) {
       char ch = str.charAt(i);
       
       if (ch >= 'a' && ch<='z') {
         ch = (char)(ch-'a'+'A');
       } else {
         ch = (char)(ch-'A'+'a');
       }
       
       sb.append(ch+"");
     }
     
     return sb;
     
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      System.out.println(toggleCase(str));
    }
}
