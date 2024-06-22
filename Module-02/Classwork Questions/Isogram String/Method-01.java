import java.io.*;
import java.util.*;

public class Solution {
   public static String isIsogram(String str) {
     for(int i=0;i<str.length();i++) {
       for(int j=i+1;j<str.length();j++) {
         if (str.charAt(i) == str.charAt(j)) {
           return "Not an Isogram";
         }
       }
     }
     
     return "Isogram";
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      System.out.println(isIsogram(str));
       
    }
}
