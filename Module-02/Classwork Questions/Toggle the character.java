import java.io.*;
import java.util.*;

public class Solution {
   public static char convertType(char ch) {
     if (ch >= 'a' && ch <= 'z') {
       return (char)(ch-'a' + 'A');
     } else {
       return (char)(ch-'A'+'a');
     }
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      char ch = scn.nextLine().charAt(0);
      
      System.out.println(convertType(ch));
    }
}
