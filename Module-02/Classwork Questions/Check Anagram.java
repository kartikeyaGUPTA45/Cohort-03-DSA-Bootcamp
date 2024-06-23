import java.io.*;
import java.util.*;

public class Solution {
    public static String checkAnagram(String s1, String s2) {
      int freq[] = new int[26];
      
      for(int i=0;i<s1.length();i++) {
        char ch = s1.charAt(i);
        int index = ch-'a';
        freq[index]++;
      }
      
      for(int i=0;i<s2.length();i++) {
        char ch = s2.charAt(i);
        int index = ch-'a';
        freq[index]--;
      }
      
      for(int i=0;i<26;i++) {
        if (freq[i] != 0) {
          return "False";
        }
      }
      
      return "True";
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String s1 = scn.next();
      String s2 = scn.next();
      
      System.out.println(checkAnagram(s1,s2));
    }
}
