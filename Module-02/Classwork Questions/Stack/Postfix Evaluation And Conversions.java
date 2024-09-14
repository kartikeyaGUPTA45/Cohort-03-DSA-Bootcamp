import java.io.*;
import java.util.*;

public class Solution {
  
    public static int operation(int op1, int op2, char opr) {
      if (opr == '+') return op1+op2;
      else if (opr == '-') return op1-op2;
      else if (opr == '*') return op1*op2;
      return op1/op2;
    }
  
    public static void postfix(String exp) {
      Stack<Integer> st1 = new Stack<>();
      Stack<String> st2 = new Stack<>(); // infix
      Stack<String> st3 = new Stack<>(); // prefix
      
      for(int i=0;i<exp.length();i++) {
        char ch = exp.charAt(i);
        
        if (ch >= '0' && ch <= '9') {
          st1.push(ch-'0');
          st2.push(ch+"");
          st3.push(ch+"");
        } else {
          int op2 = st1.pop();
          int op1 = st1.pop();
          
          int ans = operation(op1,op2,ch);
          st1.push(ans);
          
          String opp2 = st2.pop();
          String opp1 = st2.pop();
          
          st2.push("(" + opp1 + ch + opp2 + ")");
          
          opp2 = st3.pop();
          opp1 = st3.pop();
          
          st3.push(ch + opp1 + opp2);
        }
      }
      
      System.out.println(st1.pop());
      System.out.println(st2.pop());
      System.out.println(st3.pop());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String exp = scn.nextLine();
      
      postfix(exp);
    }
}
