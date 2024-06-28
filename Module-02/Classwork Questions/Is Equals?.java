import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str1 = scn.nextLine();
      String str2 = scn.nextLine();
      
      // if (str1 == str2) { // Comparing address not strings data 
      //   System.out.println(true);
      // } else {
      //   System.out.println(false);
      // }
      
      System.out.println(str1.equals(str2)); // Comparing strings data
    }
}
