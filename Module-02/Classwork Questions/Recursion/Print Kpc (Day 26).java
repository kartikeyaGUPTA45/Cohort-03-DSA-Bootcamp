import java.io.*;
import java.util.*;

public class Solution {
  
    public static String [] words = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String str, String ans) {
      if (str.length() == 0) {
        System.out.println(ans);
        return;
      }
      
      char ch = str.charAt(0);
      String ros = str.substring(1);
      
      String word = words[ch-'0'];
      for(int i=0;i<word.length();i++) {
        char c = word.charAt(i);
        printKPC(ros, ans + c);
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      
      printKPC(str,"");
    }
}
