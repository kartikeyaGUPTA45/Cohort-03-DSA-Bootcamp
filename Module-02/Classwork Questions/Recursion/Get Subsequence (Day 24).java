import java.io.*;
import java.util.*;

public class Solution {
  
    public static List<String> getSS(String str) {
      
      if (str.length() == 0) {
        List<String> base = new ArrayList<>();
        base.add("");
        return base;
      }
      
      char ch = str.charAt(0);
      String ros = str.substring(1);
      
      List<String> subAns = getSS(ros);
      
      List<String> ans = new ArrayList<>();
      
      // Not part of an answer
      for(int i=0;i<subAns.size();i++) {
        ans.add(subAns.get(i));
      }
      
      // Part of ansnwer
      for(int i=0;i<subAns.size();i++) {
        ans.add(ch + subAns.get(i));
      }      
      
      return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      
      System.out.println(getSS(str));
    }
}
