import java.io.*;
import java.util.*;

public class Solution {
  
    public static int titleToNumber(String str) {
      int ans = 0;
      for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        int num = ch-'A'+1;
        ans = ans*26 + num;
      }
      
      return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      
      System.out.println(titleToNumber(str));
      
    }
}
