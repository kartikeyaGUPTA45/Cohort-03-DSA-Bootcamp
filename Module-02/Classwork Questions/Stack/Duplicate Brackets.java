import java.io.*;
import java.util.*;

public class Solution {
  
    public static boolean duplicateBrackets(String str) {
      Stack<Character> st = new Stack<>();
      
      for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        
        if (ch != ')') {
          st.push(ch);
        } else {
          if (st.peek() == '(') {
            return true;
          } 
          
          while(st.peek() != '(') {
            st.pop();
          }
          
          st.pop();
        }
      }
      
      return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      
      System.out.println(duplicateBrackets(str));
    }
}
