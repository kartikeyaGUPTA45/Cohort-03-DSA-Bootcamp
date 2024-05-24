import java.io.*;
import java.util.*;

public class Solution {
  
    public static String printMessage1(String name) {
      return "Hello " + name; 
    }
  
    public static void printMessage(String name) {
      System.out.println ("Hello " + name);
    }
  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String name = scn.nextLine();
      
      System.out.println(printMessage1(name));
      
    }
}
