import java.io.*;
import java.util.*;

public class Solution {
  
    public static String words[] = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    
    public static List<String> getKPC(String str) {
      if (str.length() == 0) {
        List<String> base = new ArrayList<>();
        base.add("");
        return base;
      }
      
      char ch = str.charAt(0);
      String ros = str.substring(1);
      
      List<String> subAns = getKPC(ros);
      
      List<String> ans = new ArrayList<>();
      
      int index = ch-'0';
      String word = words[index];
      
      for(int i=0;i<word.length();i++) {
        char c = word.charAt(i);
        for(int j=0;j<subAns.size();j++) {
          ans.add(c + subAns.get(j));
        }
      }
      
      return ans;
      
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      System.out.println(getKPC(str));
    }
}
