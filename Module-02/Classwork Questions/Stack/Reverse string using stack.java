import java.io.*;
import java.util.*;

public class Solution {
  
    public static String reverseString(String str) {
      Stack<Character> st = new Stack<>();
      
      for(int i=0;i<str.length();i++) {
        st.push(str.charAt(i));
      }
      
      String ans = "";
      
      while(st.size()>0) {
        ans = ans + st.pop();
      }
      
      return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      System.out.println(reverseString(str));
    }
}
