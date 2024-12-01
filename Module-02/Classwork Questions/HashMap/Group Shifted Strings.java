import java.io.*;
import java.util.*;

public class Solution {
  
    public static List<String> groupShifted(String strs[], int n) {
      HashMap<String, List<String>>map = new HashMap<>();
      
      for(int i=0;i<n;i++) {
        String str = strs[i];
        
        int offset = str.charAt(0)-'a';
        String key = "";
        for(int j=0;j<str.length();j++) {
          char ch = (char)(str.charAt(j)-offset);
          if (ch <'a') ch += 26;
          key += ch;
        }
        
        if (map.containsKey(key)) {
          List<String> value = map.get(key);
          value.add(str);
        } else {
          List<String> value = new ArrayList<>();
          value.add(str);
          map.put(key,value);
        }
      }
      
      List<String> ans = new ArrayList<>();
      
      for(String key:map.keySet()) {
        ans.addAll(map.get(key));
      }
      
      return ans;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      String strs[] = new String[n];
      
      for(int i=0;i<n;i++) {
        strs[i] = scn.next();
      }
      
      List<String> ans = groupShifted(strs, n);
      Collections.sort(ans);
      System.out.println(ans);
    }
}
