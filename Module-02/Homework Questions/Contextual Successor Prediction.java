import java.io.*;
import java.util.*;

public class Solution {
  
    public static void printThird(String text, String first, String second) {
      
      String arr[] = text.split(" ");
      for(int i=0;i<arr.length-2;i++) {
        String firstWord = arr[i];
        String secondWord = arr[i+1];
        
        if (firstWord.equals(first) && secondWord.equals(second)) {
          System.out.println(arr[i+2]);
        }
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String text = scn.nextLine();
      String first = scn.next();
      String second = scn.next();
      
      printThird(text, first, second);
    }
}
