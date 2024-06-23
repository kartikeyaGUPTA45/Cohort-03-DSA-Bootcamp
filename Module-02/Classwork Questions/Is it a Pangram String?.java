import java.io.*;
import java.util.*;

public class Solution {
    public static String checkPangram(String str) {
      int freq[] = new int[26];
      for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        if (ch != ' ') {
          int index = ch-'a';
          freq[index]++;
        }
      }
      
      for(int i=0;i<26;i++) {
        if (freq[i] == 0) {
          return "NO";
        }
      }
      
      return "YES";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      System.out.println(checkPangram(str));
    }
}
