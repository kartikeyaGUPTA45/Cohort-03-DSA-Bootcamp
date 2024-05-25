import java.io.*;
import java.util.*;

public class Solution {
  
    public static String printCase(char ch) {
      if (ch >= 'a' && ch <= 'z') {
        return "Small case";
      } else if (ch >= 'A' && ch <= 'Z') {
        return "Capital case";
      } else if (ch >= '0' && ch <= '9') {
        return "Digit";
      } else {
        return "None";
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      char ch = scn.nextLine().charAt(0);
      
      System.out.println(printCase(ch));
    }
}
