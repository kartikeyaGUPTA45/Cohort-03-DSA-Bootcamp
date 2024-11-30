import java.io.*;
import java.util.*;

public class Solution {
    public static int [] findAllAnagrams(String s, String p) {
      if (p.length() > s.length()) {
        return new int[0];
      }
      
      int s_freq[] = new int[26];
      int p_freq[] = new int[26];
      
      
      for(int i=0;i<p.length();i++) {
        p_freq[p.charAt(i)-'a']++;
        s_freq[s.charAt(i)-'a']++;
      }
      
      int j=0, i = p.length()-1;
      ArrayList<Integer> arr = new ArrayList<>();
      while(i<s.length()) {
        if (Arrays.equals(s_freq,p_freq)) {
          arr.add(j);
        }
        
        i++;
        if (i<s.length()) {
          s_freq[s.charAt(i)-'a']++;
        }
        
        s_freq[s.charAt(j)-'a']--;
        j++;
      }
      
      int ans [] = new int[arr.size()];
      
      for(i=0;i<arr.size();i++) {
        ans[i] = arr.get(i);
      }
      
      return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String s = scn.next();
      String p = scn.next();
      
      int anagramArray[] = findAllAnagrams(s,p);
      
      for(int i=0;i<anagramArray.length;i++) {
        System.out.print(anagramArray[i] + " ");
      }
    }
}
