import java.io.*;
import java.util.*;

public class Solution {
    
    public static int precendence(char ch) {
      if (ch == '+' || ch == '-') return 1;
      else if (ch == '*' || ch == '/') return 2;
      return 0;
    }
    
    public static int operation(int op1, int op2, char opr) {
      if (opr == '+') return op1+op2;
      else if (opr == '-') return op1-op2;
      else if (opr == '*') return op1*op2;
      else return op1/op2;
    }
  
    public static int infixEval(String exp) {
      Stack<Integer> st1 = new Stack<>(); // Storing operands(digits)
      Stack<Character> st2 = new Stack<>(); // Storing operators
      
      for(int i=0;i<exp.length();i++) {
        char ch =exp.charAt(i);
        if (ch == '(')  { 
          st2.push(ch);
        }
        else if (ch >= '0' && ch <= '9') {
          st1.push(ch-'0');
        } 
        else if (ch == ')') {
          while(st2.peek() != '(') {
            int op2 = st1.pop();
            int op1 = st1.pop();
            char opr = st2.pop();
            
            int ans = operation(op1,op2,opr);
            st1.push(ans);
          }
          st2.pop();
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
          while(st2.size() > 0 && precendence(st2.peek()) >= precendence(ch)) {
            int op2 = st1.pop();
            int op1 = st1.pop();
            char opr = st2.pop();
            
            int ans = operation(op1,op2,opr);
            st1.push(ans);
          }
          st2.push(ch);
        }
      }
      
      while(st2.size() > 0) {
        int op2 = st1.pop();
        int op1 = st1.pop();
        char opr = st2.pop();

        int ans = operation(op1,op2,opr);
        st1.push(ans);
      }
      
      
      return st1.pop();
      
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String exp = scn.nextLine();
      System.out.println(infixEval(exp));
    }
}
