import java.io.*;
import java.util.*;


public class Solution {
    
    public static void pe(String str, String ans) {
      if (str.length() == 0) {
        System.out.println(ans);
        return;
      }
      
      char ch1 = str.charAt(0);
      if (ch1 == '0') {
        return;
      }
      
      int num1 = ch1-'0';
      String ros1 = str.substring(1);
      char decoding1 = (char)(num1-1+'a');
      pe(ros1, ans + decoding1);
      
      if (str.length() >= 2) {
        int num2 = Integer.parseInt(str.substring(0,2));
        if (num2 <=26) {
          char decoding2 = (char)(num2-1+'a');
          String ros2 = str.substring(2);
          pe(ros2, ans + decoding2);
        }
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      pe(str,"");
        
    }
}
