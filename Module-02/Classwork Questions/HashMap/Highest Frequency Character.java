import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
// 10 mins 
  
    public static char maxFreq(String str) {
      HashMap<Character,Integer> map = new HashMap<>();
    
      // Preparing the map (ch vs freq)
      for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        if (map.containsKey(ch) == true) {
          int freq = map.get(ch);
          map.put(ch,freq+1);
        } else {
          map.put(ch,1);
        }
      }
      
      // finding the max Freq character
      int maxFreq = Integer.MIN_VALUE;
      char ans = 'a';
      
      for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        
        int freq = map.get(ch);
        if (freq > maxFreq) {
          maxFreq = freq;
          ans = ch;
        }
      }
      
      return ans;
    }
  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      
      System.out.println(maxFreq(str));
    }
}
