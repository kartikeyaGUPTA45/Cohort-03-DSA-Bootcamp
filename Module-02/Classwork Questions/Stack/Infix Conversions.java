import java.io.*;
import java.util.*;

public class Solution {
  
    public static int precendence(char ch) {
      if (ch == '+' || ch == '-') return 1;
      else if (ch == '*' || ch == '/') return 2;
      else return 0;
    }
  
    public static void infixConversion(String exp) {
      
      Stack<String> st1 = new Stack<>(); // prefix
      Stack<String> st2 = new Stack<>(); // postfix
      Stack<Character> st3 = new Stack<>();
      
      for(int i=0;i<exp.length();i++) {
        char ch = exp.charAt(i);
        
        if (ch == '(') {
          st3.push(ch);
        } else if (ch == ')') {
          while(st3.peek() != '(') {
            char opr = st3.pop();
            
            String op2 = st2.pop();
            String op1 = st2.pop();
            
            st2.push(op1 + op2 + opr);
            
            op2 = st1.pop();
            op1 = st1.pop();
            
            st1.push(opr + op1 + op2);
          }
          st3.pop();
        } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
          while(st3.size() > 0 && precendence(st3.peek()) >= precendence(ch)) {
            char opr = st3.pop();
            
            String op2 = st2.pop();
            String op1 = st2.pop();
            
            st2.push(op1 + op2 + opr);
            
            op2 = st1.pop();
            op1 = st1.pop();
            
            st1.push(opr + op1 + op2);
          }
          st3.push(ch);
        } else if (ch >= 'a' && ch<= 'z') {
          st1.push(ch + "");
          st2.push(ch + "");
        }
      }
      
      while(st3.size() > 0) {
        char opr = st3.pop();
            
            String op2 = st2.pop();
            String op1 = st2.pop();
            
            st2.push(op1 + op2 + opr);
            
            op2 = st1.pop();
            op1 = st1.pop();
            
            st1.push(opr + op1 + op2);
      }
      
      System.out.println(st2.pop());
      System.out.println(st1.pop());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String exp = scn.nextLine();
      
      infixConversion(exp);
    }
}
